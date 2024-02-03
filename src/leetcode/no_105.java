package leetcode;

import java.util.HashMap;

/**
 * @author wjh
 * @date 2024/1/26 14:18
 */
public class no_105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            hashMap.put(inorder[i], i);
        }
        TreeNode root = fun(0, preorder.length - 1, 0, inorder.length - 1, preorder, hashMap);
        return root;
    }

    public TreeNode fun(int preL, int preR, int inL, int inR, int[] preorder, HashMap<Integer, Integer> hashMap) {
        if (preL>preR||inL>inR)
            return null;
        TreeNode root = new TreeNode(preorder[preL]);
        int index = hashMap.get(root.val);
        root.left = fun(preL + 1, index - inL + preL, inL, index - 1, preorder, hashMap);
        root.right = fun(preR - (inR - index - 1), preR, index + 1, inR, preorder, hashMap);
        return root;
    }
}