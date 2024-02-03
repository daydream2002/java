package leetcode;

/**
 * @author wjh
 * @date 2024/1/23 16:40
 */
public class no_108 {
    boolean flag=true;
    public boolean isValidBST(TreeNode root) {
        if (root != null) {
            int mid, left, right;
            mid = root.val;
            if (root.left != null) {
                left = root.left.val;
                if (mid <= left)
                    flag = false;
            }
            if (root.right != null) {
                right = root.right.val;
                if (mid >= right)
                    flag = false;
            }
            isValidBST(root.left);
            isValidBST(root.right);
        }
        return flag;
    }




}
