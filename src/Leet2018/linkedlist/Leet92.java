package Leet2018.linkedlist;

/**
 * @author bjxujiayi
 * @create 2018-11-06 10:02
 **/
public class Leet92 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode head = listNode;
        listNode.next = new ListNode(2);
        listNode = listNode.next;
        listNode.next = new ListNode(3);
        listNode = listNode.next;
        listNode.next = new ListNode(4);
        listNode = listNode.next;
        listNode.next = new ListNode(5);
        listNode = listNode.next;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode res = reverseBetween(dummyHead.next,2,4);
        while(res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for (int i = 0; i < m - 1; i++) {
            prev = prev.next;
        }

        ListNode cur = prev.next;
        ListNode post = cur.next;

        for (int i = 0; i < n - m; i++) {
            cur.next = post.next;
            post.next = prev.next;
            prev.next = post;
            post = cur.next;
        }
        return dummy.next;
    }
}
