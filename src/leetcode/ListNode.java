package leetcode;

import java.util.ArrayList;

public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

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
      public static void print(ListNode head){
            while (head!=null) {
                  System.out.print(head.val+" ");
                  head=head.next;
            }
      }
  }
