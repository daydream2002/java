package leetcode;

import java.util.Arrays;

/**
 * @author wjh
 * @date 2023/11/29 19:28
 */
public class no_189 {
    public static void main(String[] args) {
        int[] nums={1,2};
        int k=3;
        rotate(nums,k);
    }
    public static void rotate(int[] nums, int k) {
        if (k>nums.length)
            k=k%nums.length;
        int[] ints = new int[k];
        for (int i = 0; i < k; i++) {
            ints[i]=nums[nums.length+i-k];
        }
        System.out.println(Arrays.toString(ints));
        for (int i = nums.length-1-k; i >=0 ; i--) {
            nums[i+k]=nums[i];
        }
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < ints.length; i++) {
            nums[i]=ints[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
