package Leet2018.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author bjxujiayi
 * @create 2018-11-16 11:02
 **/
public class Leet117 {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;
        TreeLinkNode(int x) { val = x; }
    }
    public void connect(TreeLinkNode root) {
        if(root == null)
            return;
        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            TreeLinkNode pre = null;
            for(int i =0;i < levelSize ;i ++){
                TreeLinkNode node = queue.poll();
                if(node.left != null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
                if(i == 0){
                    pre = node;
                    continue;
                }else{
                    pre.next = node;
                    pre = node;
                }
            }
            pre.next = null;
        }
    }
}
