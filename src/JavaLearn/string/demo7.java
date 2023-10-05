package JavaLearn.string;

import java.util.Scanner;

public class demo7 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(',');
            }
        }
        String str=sb.append(']').toString();
        System.out.println(sb);
    }
}
