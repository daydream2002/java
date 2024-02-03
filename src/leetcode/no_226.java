package leetcode;

/**
 * @author wjh
 * @date 2023/12/16 10:22
 */
public class no_226 {
    public static void main(String[] args) {

    }
    public TreeNode invertTree(TreeNode root) {
        if (root==null)
            return null;
        TreeNode l=root.left,r=root.right;
        root.right=l;
        root.left=r;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
