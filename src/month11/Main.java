package month11;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author wjh
 * @date  2023/11/29 15:39
 */
public class Main {
    public static void main(String[] args) throws IOException {
        int[] a={1,2,3,4};
        Solution solution=new Solution();
        solution.productExceptSelf(a);

    }
}
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] a= new int[nums.length];
        int k=1;
        a[0]=k;
        for (int i = 1; i < nums.length; i++) {
            a[i]=a[i-1]*nums[i-1];
        }
        for (int i =nums.length - 2; i >=0; i--) {
            k=k*nums[i+1];
            System.out.println(k);
            a[i]=a[i]*k;
        }
        System.out.println(Arrays.toString(a));
        return a;
    }
}