package leetcode;

import java.util.HashSet;

/**
 * @author wjh
 * @date 2023/12/8 19:07
 */
public class no_142 {
    public static ListNode detectCycle(ListNode head) {
        HashSet<ListNode> listNodes = new HashSet<>();
        ListNode p=head;
        while (p!=null){
            if (listNodes.contains(p))
                return p;
            else
                listNodes.add(p);
            p=p.next;
        }
        return null;
    }
}
