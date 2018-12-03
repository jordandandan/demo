package Leet2018.linkedlist;

/**
 * @author bjxujiayi
 * @create 2018-11-27 11:39
 **/
public class Leet143 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode myPrev = head;
        while(fast != null && fast.next !=null){
            fast = fast.next.next;
            myPrev = slow;
            slow = slow.next;
        }
        //cut tow list
        myPrev.next = null;
        //reverse the second list
        ListNode curr = slow;
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //merge two list
        curr = head;
        ListNode currNext = null, prevNext = null;
        while(curr.next != null && prev != null){
            currNext = curr.next;
            prevNext = prev.next;
            curr.next = prev;
            prev.next = currNext;
            prev = prevNext;
            curr = currNext;
        }
        curr.next = prev;
    }
}
