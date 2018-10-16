package Leet2018;

/**
 * @author bjxujiayi
 * @create 2018-10-12 18:22
 **/
public class Leet21 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode head = null, point = null;
        while(l1!=null && l2!=null){
            if(l1.val <= l2.val){
                if(head == null){
                    head = new ListNode(l1.val);
                    point = head;
                    l1 = l1.next;
                }else{
                    point.next = l1;
                    point = point.next;
                    l1 = l1.next;
                }
            }else{
                if(head == null){
                    head = new ListNode(l2.val);
                    point = head;
                    l2 = l2.next;
                }else{
                    point.next = l2;
                    point = point.next;
                    l2 = l2.next;
                }
            }
        }
        if(l1!=null){
            point.next = l1;
        }else if(l2!=null){
            point.next = l2;
        }
        return head;
    }
}
