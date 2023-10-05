package JavaLearn.string;

import java.util.Scanner;

public class demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String s1=sc.next();
        System.out.println(s1);
        String result=new String();
        for (int i = 0; i < s1.length(); i++) {
            result=s1.charAt(i)+result;
        }
        System.out.println(result);
    }
}
