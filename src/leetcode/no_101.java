package leetcode;

/**
 * @author wjh
 * @date 2023/12/16 10:29
 */
public class no_101 {
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return dfs(root.right, root.left);
    }

    public boolean dfs(TreeNode r, TreeNode l) {
        if (r == null && l == null)
            return true;
        if (l == null || r == null)
            return false;
        if (l.val!= r.val)
            return false;
        return dfs(l.left, r.right) && dfs(l.right, r.left);
    }

}
