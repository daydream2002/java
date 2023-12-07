package leetcode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author wjh
 * @date 2023/12/6 8:26
 */
public class no_206 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        ListNode head = create(list);
        ListNode p = head;
        while (p != null) {
            System.out.print(p.val + "->");
            p = p.next;
        }
        System.out.println();
        ListNode new_head = reverseList(head);
        p = new_head;
        while (p != null) {
            System.out.print(p.val + "->");
            p = p.next;
        }


    }

    public static ListNode reverseList(ListNode head) {
        ListNode p, q;
        if (head==null||head.next==null)
            return head;
        p = head.next;
        q = p.next;
        head.next=null;
        int i=0;
        while (true){
            p.next=head;
            head=p;
            p=q;
            if (p==null)
                break;
            q=p.next;
        }
        return head;
    }

    public static ListNode create(ArrayList<Integer> arr) {
        ListNode tail, head;
        if (!arr.isEmpty()) {
            head = new ListNode(arr.getFirst());
            tail = head;
            arr.removeFirst();
        } else
            return null;
        while (!arr.isEmpty()) {
            ListNode node = new ListNode(arr.getFirst());
            arr.removeFirst();
            tail.next = node;
            tail = node;
        }
        return head;
    }
}
