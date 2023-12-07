package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/**
 * @author wjh
 * @date 2023/12/7 14:05
 */
public class no_234 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,2,1);
        ListNode head = create(list);
        boolean b = isPalindrome(head);
        System.out.println(b);
    }

    public static boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode p = head;
        while (p != null) {
            list.add(p.val);
            p = p.next;
        }
        while (true) {
            if (list.size() == 1|| list.isEmpty())
                return true;
            Integer first = list.remove(0);
            System.out.println(first);
            Integer last = list.remove(list.size() - 1);
            if (!first.equals(last))
                return false;
        }
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
