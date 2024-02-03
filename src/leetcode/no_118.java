package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wjh
 * @date 2024/2/2 15:27
 */
public class no_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if(j==0||j==i-1)
                    list.add(j,1);
                else
                    list.add(j, ans.get(i-2).get(j-1)+ans.get(i-2).get(j));
            }
            ans.add(list);
        }
        return ans;
    }
}
