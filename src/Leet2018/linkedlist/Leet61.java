package Leet2018.linkedlist;

/**
 * @author bjxujiayi
 * @create 2018-10-23 16:03
 **/
public class Leet61 {
    public static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode dummyHead = new ListNode(0);
        ListNode head = dummyHead;
        int i =1;
        while(i<6){
            ListNode temp = new ListNode(i);
            i++;
            head.next = temp;
            head = head.next;
        }
        ListNode res = rotateRight(dummyHead.next, 2);
        ListNode p =res;
        while(p!=null){
            System.out.println(p.val);
            p = p.next;
        }
    }
    public static  ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        int length = 0;
        ListNode p = head;
        while(p!=null){
            p = p.next;
            length ++;
        }
        System.out.println(length);
        int interval = k % length;
        ListNode slow = head, fast = head;
        int count = interval;
        while(count-- > 0){
            fast = fast.next;
        }
        while(fast.next !=null){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = head;
        head = slow.next;
        slow.next = null;
        return head;
    }
}
