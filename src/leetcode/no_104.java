package leetcode;

/**
 * @author wjh
 * @date 2023/12/15 13:17
 */
public class no_104 {
    static int dept = 0;
    public static void main(String[] args) {

    }
    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return Math.max(l, r) + 1;
    }
}


