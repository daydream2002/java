package leetcode;

import java.util.ArrayList;

/**
 * @author wjh
 * @date 2024/1/24 10:02
 */
public class no_98 {
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Fun(root,list);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i)<=list.get(i-1))
                return false;
        }
        return true;
    }
    public void Fun(TreeNode root,ArrayList<Integer>  arrayList){
        if (root==null)
            return;
        Fun(root.left,arrayList);
        arrayList.add(root.val);
        Fun(root.right,arrayList);
    }
}
