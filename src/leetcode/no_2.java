package leetcode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author wjh
 * @date 2023/12/9 15:19
 */
public class no_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list1, 3, 7);
        Collections.addAll(list2, 9, 2);
        ListNode head1 = create(list1);
        ListNode head2 = create(list2);
        ListNode listNode = addTwoNumbers(head1, head2);
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int ben = 0, next = 0;
        ListNode tail = null;
        ListNode head1 = l1, head2 = l2;
        while (l1 != null && l2 != null) {
            ben = l1.val + l2.val + next;
            l1.val = l2.val = ben % 10;
            next = ben / 10;
            if (l1.next == null)
                tail = l1;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null) {
            while (l1 != null) {
                ben = l1.val + next;
                l1.val = ben % 10;
                next = ben / 10;
                if (l1.next == null)
                    tail = l1;
                l1 = l1.next;
            }
            if (next == 1) {
                tail.next = new ListNode(1, null);
                next = 0;
            }
            return head1;
        }
        if (l2 != null) {
            while (l2 != null) {
                ben = l2.val + next;
                l2.val = ben % 10;
                next = ben / 10;
                if (l2.next == null)
                    tail = l2;
                l2 = l2.next;
            }
            if (next == 1) {
                tail.next = new ListNode(1, null);
                next = 0;
            }
            return head2;
        }
        if (next == 1) {
            tail.next = new ListNode(1, null);

        }
        return head1;
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
