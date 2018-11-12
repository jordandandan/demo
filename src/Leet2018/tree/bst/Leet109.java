package Leet2018.tree.bst;

import Leet2018.linkedlist.Leet2;

/**
 * @author bjxujiayi
 * @create 2018-11-12 14:09
 **/
public class Leet109 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public TreeNode sortedListToBST(ListNode head) {
        return generate(head, null);
    }

    private TreeNode generate(ListNode head, ListNode tail) {
        if(head == tail){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != tail && fast.next != tail){
            slow = slow.next;
            fast = fast.next.next;
        }
        TreeNode root = new TreeNode(slow.val);
        root.left = generate(head, slow);
        root.right = generate(slow.next, tail);
        return root;
    }
}
