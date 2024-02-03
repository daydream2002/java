package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wjh
 * @date 2023/12/18 10:38
 */
public class no_102 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,3,9,20,null,null,15,7);
        TreeNode creat = TreeNode.Creat(list);
        List<List<Integer>> lists = levelOrder(creat);
        for (List<Integer> integers : lists) {
            System.out.print(integers+", ");
        }
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if (root==null)
            return ans;
        list.add(root);
        while (!list.isEmpty()) {
            ArrayList<TreeNode> temp = new ArrayList<>();
            ArrayList<Integer> tempv = new ArrayList<>();
            for (TreeNode node : list) {
                tempv.add(node.val);
                if (node.left != null)
                    temp.add(node.left);
                if (node.right != null)
                    temp.add(node.right);
            }
            ans.add(tempv);
            list.clear();
            list = temp;
        }
        return ans;
    }
}
