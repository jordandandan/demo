package Leet2018;

/**
 * @author bjxujiayi
 * @create 2018-10-16 19:37
 **/
public class Leet24 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode prev = dummyHead, curr = head;
        while(curr!=null && curr.next!=null){
            ListNode q = curr.next,r = curr.next.next;
            prev.next = q;
            q.next = curr;
            curr.next = r;
            prev = curr;
            curr = curr.next;
        }
        return dummyHead.next;
    }
}
