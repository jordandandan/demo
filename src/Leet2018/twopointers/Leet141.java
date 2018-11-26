package Leet2018.twopointers;

/**
 * @author bjxujiayi
 * @create 2018-11-26 14:15
 **/
public class Leet141 {
     class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
           val = x;
           next = null;
       }
   }
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode fast = head.next;
        while(fast.next != null && fast.next.next !=null && head != fast){
            head = head.next;
            fast = fast.next.next;
        }
        if(fast == head){
            return true;
        }
        return false;
    }
}
