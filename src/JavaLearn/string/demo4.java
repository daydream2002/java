package JavaLearn.string;

import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        String Username = "zhangsan";
        String Password="123456";
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();
            if (username.equals(Username)&&Password.equals(password)){
                System.out.println("登录成功");
                break;
            }
            else {
                System.out.println("密码错误");
            }
        }

    }
}
