package leetcode;

import java.util.ArrayList;

/**
 * @author wjh
 * @date 2024/1/29 15:56
 */
public class no_437 {
    public int pathSum(TreeNode root, int targetSum) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        ArrayList<TreeNode> list = new ArrayList<>();
        list.add(root);
        while (!list.isEmpty()){
            ArrayList<Integer> list1 = new ArrayList<>();
            int len=list.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = list.removeFirst();
                list1.add(node.val);
                if (node.left!=null)
                    list.add(node.left);
                if (node.right!=null)
                    list.add(node.right);
            }
            arrayLists.add(list1);
        }

        return targetSum;
    }
}
