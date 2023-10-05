package JavaLearn.string;

import java.util.Random;

public class demo11 {
    public static void main(String[] args) {
        Random rd=new Random();
        char[] arr=new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i<26){
                arr[i]= (char) (97+i);
            }else {
                arr[i]=(char) (65+i-26);
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index= rd.nextInt(52);
            sb.append(arr[index]);
        }
        System.out.println(sb);
        int index= rd.nextInt(4);
        int num=rd.nextInt(10);
        sb.insert(1,num);
        System.out.println(sb);

    }
}
