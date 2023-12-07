package month12;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Properties;

/**
 * @author wjh
 * @date 2023/12/7 9:51
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(2048);
        Properties prop = new Properties();
        ArrayList<Socket> socketList = new ArrayList<>();
        prop.load(new FileInputStream("src/month12/info.properties"));
        while (true) {
            Socket socket = ss.accept();
            System.out.println("有客户端连接");
            new Thread(new MyRun(prop, socket, socketList)).start();
        }
    }
}

class MyRun implements Runnable {
    Properties prop;
    Socket socket;
    ArrayList<Socket> socketList;

    public MyRun(Properties prop, Socket socket, ArrayList<Socket> socketList) {
        this.prop = prop;
        this.socket = socket;
        this.socketList = socketList;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                String choose = br.readLine();
                switch (choose) {
                    case "1" -> Login(br);
                    case "2" -> register(br);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void register(BufferedReader br) throws IOException {
        System.out.println("用户选择注册");
        String userinfo = br.readLine();
        System.out.println(userinfo);
        String[] split = userinfo.split("&");
        String username = split[0].split("=")[1];
        String password = split[1].split("=")[1];
        System.out.println(username + " " + password);
        if (prop.containsKey(username)) {
            sentMsg("2");
        } else if (verifyName(username) && verifyPassword(password)) {
            sentMsg("1");
            prop.setProperty(username, password);
            System.out.println("保存用户信息");
            prop.store(new FileWriter("src/month12/info.properties"), "adduser");
        } else {
            sentMsg("3");
        }

    }

    private boolean verifyName(String name) {
        //长度6-18
        if (name.length() < 6 || name.length() > 18)
            return false;
        //只能是字母
        for (int i = 0; i < name.length(); i++) {
            if (!(name.charAt(i) >= 'a' && name.charAt(i) <= 'z' || name.charAt(i) >= 'A' && name.charAt(i) <= 'Z'))
                return false;
        }
        return true;
    }

    private boolean verifyPassword(String password) {
        if (password.length() < 3 || password.length() > 8)
            return false;
        //第一位为字母
        if (!(password.charAt(0) >= 'a' && password.charAt(0) <= 'z' || password.charAt(0) >= 'A' && password.charAt(0) <= 'Z'))
            return false;
        //后面几位是纯数字
        for (int i = 1; i < password.length(); i++) {
            if (!(password.charAt(i) >= '0' && password.charAt(i) <= '9'))
                return false;
        }
        return true;
    }

    private void Login(BufferedReader br) throws IOException {
        System.out.println("用户选择登录");
        String userinfo = br.readLine();
        System.out.println(userinfo);
        String[] split = userinfo.split("&");
        String username = split[0].split("=")[1];
        String password = split[1].split("=")[1];
        System.out.println(username + " " + password);
        if (prop.containsKey(username)) {
            String rightPassword = prop.get(username) + "";
            if (password.equals(rightPassword)) {
                sentMsg("1");
                socketList.add(socket);
                while (true) {
                    String msg = username + "  说:  " + br.readLine();
                    sent2All(msg, socketList);
                }
            } else {
                sentMsg("2");
            }
        } else {
            sentMsg("3");
        }
    }

    private void sent2All(String msg, ArrayList<Socket> socketList) throws IOException {
        for (Socket socket : socketList) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write(msg);
            bw.newLine();
            bw.flush();
        }
    }

    private void sentMsg(String msg) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(msg);
        bw.newLine();
        bw.flush();
    }
}