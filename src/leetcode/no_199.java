package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wjh
 * @date 2024/1/24 10:40
 */
public class no_199 {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<TreeNode> treeNodes = new ArrayList<>();
        if (root != null) treeNodes.add(root);
        else return list;
        while (!treeNodes.isEmpty()) {
            int len = treeNodes.size();
            for (int i = 0; i < len; i++) {
                TreeNode first = treeNodes.remove(0);
                if (i == len - 1)
                    list.add(first.val);
                if (first.left != null) treeNodes.add(first.left);
                if (first.right != null) treeNodes.add(first.right);
            }
        }
        return list;
    }

}
