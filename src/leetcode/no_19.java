package leetcode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author wjh
 * @date 2023/12/9 19:15
 */
public class no_19 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2);
        ListNode head = ListNode.create(list);
        ListNode node = removeNthFromEnd(head, 2);
        ListNode.print(node);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p=head,q=head;
        int count=1;
        while (q.next!=null){
            q=q.next;
            if (count++>n)
                p=p.next;
        }
        if (count==n)
            return p.next;
        if (p==q)
            return null;
        p.next=p.next.next;
        return head;
    }
}
