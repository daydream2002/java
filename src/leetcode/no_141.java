package leetcode;

/**
 * @author wjh
 * @date 2023/12/8 18:02
 */
public class no_141 {
    public static void main(String[] args) {

    }

    public static boolean hasCycle(ListNode head) {
        ListNode p = head, q = head;
        if (head == null)
            return false;
        while (p.next != null && q.next != null) {
            p = p.next;
            q = q.next;
            q = q.next;
            if (q == null)
                return false;
            if (p == q)
                return true;
        }
        return false;
    }
}
