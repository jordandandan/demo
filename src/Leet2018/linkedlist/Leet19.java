package Leet2018.linkedlist;

/**
 * @author bjxujiayi
 * @create 2018-10-18 17:17
 **/
public class Leet19 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
     }
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode p1 = head, p2 = head;
        while(n--> 0){
            p2 = p2.next;
        }
        while(p2!=null && p2.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        if(p2 == null){
            return p1.next;
        }
        p1.next = p1.next.next;
        return head;

    }
}
