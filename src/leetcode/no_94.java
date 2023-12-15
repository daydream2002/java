package leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {

    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> treeNodes = new ArrayList<>();
        digui(root, treeNodes);
        return treeNodes;
    }

    public static void digui(TreeNode root, ArrayList<Integer> treeNodes) {
        if (root==null)
            return;
        digui(root.left, treeNodes);
        treeNodes.add(root.val);
        digui(root.right, treeNodes);
    }
}