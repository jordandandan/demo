package Leet2018.linkedlist;

/**
 * @author bjxujiayi
 * @create 2018-11-02 10:24
 **/
public class Leet86 {
    public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null) return head;

        ListNode Partition = head;

        ListNode nhead = new ListNode(0);
        nhead.next = null;
        ListNode ntail = nhead;

        ListNode nhead2 = new ListNode(0);
        nhead2.next = null;
        ListNode ntail2 = nhead2;

        ListNode p = null;
        while(Partition!=null){
            if(Partition.val < x){
                p = Partition.next;
                ntail.next = Partition;
                ntail = ntail.next;
                ntail.next = null;
                Partition = p;
            }
            else{
                p = Partition.next;
                ntail2.next = Partition;
                ntail2 = ntail2.next;
                ntail2.next = null;
                Partition = p;
            }
        }
        ntail.next = nhead2.next;
        return nhead.next;
    }
}
