package Leet2018;

/**
 * @author bjxujiayi
 * @create 2018-10-08 20:00
 **/
public class Leet2 {
    public static void main(String[] args) {

    }
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1, q = l2, dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;
        while(p != null || q != null){
            int x = (p==null)? 0 : p.val;
            int y = (q==null)? 0 : q.val;
            int digit = x + y + carry ;
            carry = digit / 10;
            curr.next = new ListNode(digit % 10);
            curr = curr.next;
            if(p!=null)
                p = p.next;
            if(q!=null)
                q = q.next;
        }
        if(carry != 0){
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
