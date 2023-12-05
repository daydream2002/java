package leetcode;

/**
 * @author wjh
 * @date 2023/12/5 16:07
 */
public class no_160 {
    public static void main(String[] args) {
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int la = 0, lb = 0;
        ListNode a = headA, b = headB;
        while (true) {
            la++;
            a=a.next;
            if (a == null)
                break;
        }
        while (true) {
            b=b.next;
            lb++;
            if (b == null)
                break;
        }
        System.out.println(la+" "+lb);
        int max = Math.max(la, lb);
        if (max == la) {
            a = headA;
            b = headB;
            for (int i = 0; i < la - lb; i++) {
                a=a.next;
            }
            while (a!=null&&b!=null){
                if (a==b)
                    return a;
                System.out.println(a.val+" "+b.val);
                a=a.next;
                b=b.next;
            }
            return null;
        }else {
            a = headA;
            b = headB;
            for (int i = 0; i < lb - la; i++) {
                b=b.next;
            }
            while (a!=null&&b!=null){
                if (a==b)
                    return a;
                a=a.next;
                b=b.next;
            }
            return null;
        }
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}