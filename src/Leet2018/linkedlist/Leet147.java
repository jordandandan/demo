package Leet2018.linkedlist;

/**
 * @author bjxujiayi
 * @create 2018-12-03 10:48
 **/
public class Leet147 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode insertionSortList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode dummyHead = new ListNode(0);
        while(head != null){
            ListNode target = dummyHead;
            ListNode curr = head;
            head = head.next;
            while(target.next != null && curr.val > target.next.val){
                target = target.next;
            }
            curr.next = target.next;
            target.next = curr;
        }
        return dummyHead.next;
    }
}
