package Leet2018.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author bjxujiayi
 * @create 2018-11-06 11:09
 **/
public class Leet94 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inOrderVisit(root, res);
        return res;
    }

    /**
     * Recursion method
     * @param root
     * @param res
     */
    private void inOrderVisit(TreeNode root, List<Integer> res) {
        if(root == null)
            return;
        inOrderVisit(root.left, res);
        res.add(root.val);
        inOrderVisit(root.right,res);
    }

    /**
     * Non-recursion method
     * @param root
     * @param res
     */
    private void nonRecursionInorderVisit(TreeNode root, List<Integer> res){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            if(!stack.isEmpty()){
                root = stack.pop();
                res.add(root.val);
                root = root.right;
            }
        }
    }
}
