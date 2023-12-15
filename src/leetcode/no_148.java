package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author wjh
 * @date 2023/12/12 10:05
 */
public class no_148 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,4,2,1,3);
        ListNode head = ListNode.create(list);
        ListNode listNode = sortList(head);
        //ListNode.print(listNode);
    }

    public static ListNode sortList(ListNode head) {
        if (head==null)
            return null;
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode p=head;
        while (p!=null){
            list.add(p);
            p=p.next;
        }
        list.sort((o1, o2) -> o1.val - o2.val);
        for (ListNode listNode : list) {
            System.out.println(listNode.val);
        }
        for (int i = 0; i < list.size()-1; i++) {
            list.get(i).next=list.get(i+1);
        }
        list.get(list.size()-1).next=null;
        return list.get(0);
    }
}
