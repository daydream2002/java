package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 * @author wjh
 * @date 2023/12/14 16:35
 */
public class TreeNode {
    public static TreeNode Creat(ArrayList<Integer> list) {
        TreeNode root = new TreeNode(list.getFirst());
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        list.removeFirst();
        while (!deque.isEmpty()) {
            TreeNode pop = deque.pop();
            System.out.println(pop.val);
            if (!list.isEmpty()) {
                if (list.getFirst()==null)
                {
                    list.removeFirst();
                }else {
                    pop.left = new TreeNode(list.getFirst());
                    deque.add(pop.left);
                    list.removeFirst();
                }
            }else {
                break;
            }
            if (!list.isEmpty()) {
                if (list.getFirst()==null)
                {
                    list.removeFirst();
                }else {
                    pop.right = new TreeNode(list.getFirst());
                    deque.add(pop.right);
                    list.removeFirst();
                }
            }else {
                break;
            }
        }
        return root;
    }

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
