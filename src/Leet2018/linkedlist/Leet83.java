package Leet2018.linkedlist;

/**
 * @author bjxujiayi
 * @create 2018-11-01 14:50
 **/
public class Leet83 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode p = head, q = head.next;
        while(q != null ){
            while(q != null && p.val == q.val){
                q = q.next;
            }
            p.next = q;
            p = p.next;
            if(q!=null)
                q = q.next;
        }
        return dummyHead.next;
    }
}
