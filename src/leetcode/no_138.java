package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.logging.Handler;

/**
 * @author wjh
 * @date 2023/12/11 19:10
 */
public class no_138 {
    public static void main(String[] args) {

    }

    public static Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        Node p=head;
        while (p!=null){
            map.put(p,new Node(p.val));
            p=p.next;
        }
        p=head;
        while (p!=null){
             map.get(p).next=map.get(p.next);
             map.get(p).random=map.get(p.random);
             p=p.next;
        }
        return map.get(head) ;
    }
}
