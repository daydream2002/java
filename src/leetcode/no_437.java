package leetcode;

import java.util.ArrayList;

/**
 * @author wjh
 * @date 2024/1/29 15:56
 */
public class no_437 {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null)
            return 0;
        int ans = 0;
        ans += rootSum(root, targetSum);
        ans += pathSum(root.left, targetSum);
        ans += pathSum(root.right, targetSum);
        return ans;
    }

    public int rootSum(TreeNode root, int targetSum) {
        if (root == null)
            return 0;
        int ans = 0;
        if (root.val == targetSum)
            ans++;
        ans += rootSum(root.left, targetSum - root.val);
        ans += rootSum(root.right, targetSum - root.val);
        return ans;
    }
}
