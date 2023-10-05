package JavaLearn.string;

import java.util.Scanner;

public class demo9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        while (true){
            str=sc.next();
            boolean flag = cheak(str);
            if(flag){
                break;
            }
            else {
                System.out.println("请重新输入");
            }
        }
        System.out.println(transfer(str));
    }
    public static boolean cheak(String str){
        if (str.length()>9){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)<'0'||str.charAt(i)>'9'){
                return false;
            }
        }
        return true;
    }
    public static String transfer(String str){
        char[] a = {' ','一','二','三','四','五','六','七','八','九'};
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int index=str.charAt(i)-'0';
            sb.append(a[index]);
        }
        return sb.toString();
    }
}
