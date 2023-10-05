package JavaLearn.string;

import java.util.Arrays;

public class demo10 {
    public static void main(String[] args) {
        String a="abcd";
        String b="cdab";
        char[] ch = a.toCharArray();
        System.out.println(ch[0]);
        String c = new String(ch);


        int min=Math.min(a.length(),b.length());
        for (int i = 0; i < min; i++) {
            a=xuanzhuan(a);
            if (a.equals(b)){
                System.out.println("相同");
                return;
            }
        }
        System.out.println("不相同");
    }
    public static String xuanzhuan(String str){
        char first=str.charAt(0);
        String end=str.substring(1);
        return end+first;
    }
}
