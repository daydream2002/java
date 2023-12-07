package month12;

import java.io.*;
import java.net.Socket;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author wjh
 * @date 2023/12/7 9:51
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 2048);
        while (true) {
            System.out.println("连接成功");
            System.out.println("进入聊天室");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("请选择");
            Scanner sc = new Scanner(System.in);
            String choose = sc.nextLine();
            switch (choose) {
                case "1" -> Login(socket);
                case "2" -> register(socket);
                default -> System.out.println("不存在的选项");
            }
        }
    }

    private static void register(Socket socket) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        String sb = "username=" + username + "&password=" + password;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        //登录
        sentMsg("2", bw);
        //传输用户名和密码
        sentMsg(sb, bw);


        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = br.readLine();
        switch (line) {
            case "1" -> {
                System.out.println("注册成功");
            }
            case "2" -> System.out.println("用户名已存在");
            case "3"-> System.out.println("用户名或密码不符合要求");
        }

    }

    private static void Login(Socket socket) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        String sb = "username=" + username + "&password=" + password;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        //登录
        sentMsg("1", bw);
        //传输用户名和密码
        sentMsg(sb, bw);

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = br.readLine();
        switch (line) {
            case "1" -> {
                System.out.println("登陆成功，开始聊天");
                new Thread(new MyRunC(br)).start();
                //开始聊天
                while (true) {
                    System.out.println("输入要说的话");
                    String msg = sc.nextLine();
                    sentMsg(msg, bw);
                }
            }
            case "2" -> System.out.println("用户名或密码错误");
            case "3" -> System.out.println("用户名不存在");
        }
    }

    private static void sentMsg(String msg, BufferedWriter bw) throws IOException {
        bw.write(msg);
        bw.newLine();
        bw.flush();
    }
}

class MyRunC implements Runnable {
    BufferedReader br;

    public MyRunC(BufferedReader br) {
        this.br = br;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String line = br.readLine();
                System.out.println(line);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}