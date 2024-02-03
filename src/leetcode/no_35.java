package leetcode;

/**
 * @author wjh
 * @date 2024/1/26 14:25
 */
public class no_35 {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target==nums[i]||target<nums[i])
                return i;
        }
        return nums.length;
    }
}
