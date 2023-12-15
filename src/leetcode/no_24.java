package leetcode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author wjh
 * @date 2023/12/10 14:12
 */
public class no_24 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4);
        ListNode head = ListNode.create(list);
        head = digui(head);
        ListNode.print(head);
    }
    /*迭代*/
    public static ListNode swapPairs(ListNode head) {
        ListNode tempHead = new ListNode(0, head);
        if (head==null)
            return null;
        if (head.next==null)
            return head;
        ListNode  temp, p, q;
        tempHead.next = head;
        temp = tempHead;
        q = tempHead.next;
        p = q.next;
        while (p != null){
            temp.next=p;
            q.next=p.next;
            p.next=q;
            temp=temp.next.next;
            q=temp.next;
            if (q==null||q.next==null)
                break;
            p=q.next;
        }
        return tempHead.next;
    }
    /*递归*/
    public static ListNode digui(ListNode head){
        if (head==null||head.next==null)
            return head;
        ListNode newHead;
        newHead=head.next;
        head.next = digui(newHead.next);
        newHead.next=head;
        return newHead;
    }
}
