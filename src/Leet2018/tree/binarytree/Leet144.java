package Leet2018.tree.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author bjxujiayi
 * @create 2018-11-27 13:57
 **/
public class Leet144 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    //Recursive method
    public List<Integer> preorderTraversalRecursive(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        preorderRecursive(res, root);
        return res;
    }

    private void preorderRecursive(List<Integer> res, TreeNode root) {
        if(root == null){
            return;
        }
        res.add(root.val);
        preorderRecursive(res, root.left);
        preorderRecursive(res, root.right);
    }
    //iteration method
    private void preorderIterate(List<Integer> res, TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(null == root){
            return;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            if(temp.right != null){
                stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
            res.add(temp.val);
        }
    }
}
