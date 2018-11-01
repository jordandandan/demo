package Leet2018.linkedlist;

/**
 * @author bjxujiayi
 * @create 2018-11-01 13:55
 **/
public class Leet82 {
    public static  class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode dummyHead = new ListNode(0);
        ListNode p = dummyHead, q = head;
        dummyHead.next = head;
        while(q != null ){
            boolean isDup = false;
            while(q.next != null && q.val == q.next.val){
                q = q.next;
                isDup = true;
            }
            if(isDup){
                q = q.next;
                continue;
            }
            p.next = q;
            p = p.next;
            q = q.next;
        }
        p.next = q;
        return dummyHead.next;
    }

    public static void main(String[] args) {

        ListNode listNode = new ListNode(2);
        ListNode head = listNode;
        listNode.next = new ListNode(2);
        listNode = listNode.next;
        listNode.next = new ListNode(2);
        listNode = listNode.next;
        listNode.next = new ListNode(3);
        listNode = listNode.next;
        listNode.next = new ListNode(3);
        listNode = listNode.next;
        listNode.next = new ListNode(4);
        listNode = listNode.next;
        listNode.next = new ListNode(4);
        listNode = listNode.next;
        head = deleteDuplicates(head);
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
