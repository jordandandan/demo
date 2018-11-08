package Leet2018.tree.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author bjxujiayi
 * @create 2018-11-08 10:00
 **/
public class Leet102 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levleSize = queue.size();
            List<Integer> levelVal = new ArrayList<Integer>();
            for(int i = 0; i< levleSize ;i++){
                if(queue.peek().left != null){
                    queue.add(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.add(queue.peek().right);
                }
                levelVal.add(queue.poll().val);
            }
            res.add(levelVal);
        }
        return res;
    }
}
