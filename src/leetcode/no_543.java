package leetcode;

/**
 * @author wjh
 * @date 2024/1/23 10:01
 */
public class no_543 {
    int ans;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 0;
        depth(root);
        return ans;
    }

    public int depth(TreeNode root) {
        if (root == null)
            return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        ans = Math.max(left + right, ans);
        return Math.max(left, right) + 1;
    }

}
