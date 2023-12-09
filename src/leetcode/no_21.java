package leetcode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author wjh
 * @date 2023/12/9 14:51
 */
public class no_21 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list1, 1);
        //Collections.addAll(list2, );
        ListNode head1 = create(list1);
        ListNode head2 = create(list2);
        ListNode listNode = mergeTwoLists(head1, head2);
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head, p = null;
        if (list1 == null && list2 == null)
            return null;
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        if (list1.val > list2.val) {
            head = list2;
            list2 = list2.next;
        } else {
            head = list1;
            list1 = list1.next;
        }
        p = head;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                p.next = list2;
                p = p.next;
                list2 = list2.next;
            } else {
                p.next = list1;
                p = p.next;
                list1 = list1.next;
            }
        }
        if (list1 != null)
            p.next = list1;
        if (list2 != null)
            p.next = list2;
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
