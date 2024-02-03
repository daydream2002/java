package leetcode;

/**
 * @author wjh
 * @date 2024/1/24 10:13
 */
public class no_230 {
    int k;
    int ans;
    public int kthSmallest(TreeNode root, int k) {
        this.k=k;
        fun(root);
        return ans;
    }

    public void fun(TreeNode root) {
        if (root==null)
            return;
        fun(root.left);
        if (--k==0)
            ans=root.val;
        fun(root.right);
    }


}
