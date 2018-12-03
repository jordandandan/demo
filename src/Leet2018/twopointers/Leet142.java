package Leet2018.twopointers;

/**
 * https://blog.csdn.net/Jaster_wisdom/article/details/81275268
 * @author bjxujiayi
 * @create 2018-11-27 10:12
 **/
public class Leet142 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null||head.next.next==null)
            return null;
        ListNode slow = head.next;;
        ListNode fast = head.next.next;
        while(fast!=slow){
            slow = slow.next;
            if(fast==null)
                return null;
            if(fast.next!=null)
                fast = fast.next.next;
            else
                return null;
        }
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
