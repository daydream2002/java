package leetcode;

import java.util.ArrayList;

/**
 * @author wjh
 * @date 2024/1/25 11:46
 */
public class no_114 {
    ArrayList<TreeNode> list = new ArrayList<>();
    public void flatten(TreeNode root) {

        preOrder(root);
        if (root==null)
            return;
        root=list.get(0);
        for (int i = 0; i < list.size()-1; i++) {
            list.get(i).right=list.get(i+1);
            list.get(i).left=null;
            System.out.println(list.get(i).val);
        }
        while (root!=null){
            System.out.println(root.val);
            root=root.right;
        }
    }
    public void preOrder(TreeNode root){
        if (root==null)
            return;
        list.add(root);
        preOrder(root.left);
        preOrder(root.right);
    }

}
