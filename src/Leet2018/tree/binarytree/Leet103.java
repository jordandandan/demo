package Leet2018.tree.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author bjxujiayi
 * @create 2018-11-08 12:05
 **/
public class Leet103 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null)
            return result;
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();

        s1.push(root);

        while(!s1.isEmpty() || !s2.isEmpty()){
            List<Integer> res = new ArrayList<Integer>();
            while(!s1.isEmpty()){
                TreeNode temp = s1.pop();

                res.add(temp.val);
                if(temp.left!=null)s2.push(temp.left);
                if(temp.right!=null) s2.push(temp.right);
            }
            if(res.size()>0){
                result.add(res);
                res = new ArrayList<Integer>();
            }
            while(!s2.isEmpty()){

                TreeNode temp = s2.pop();
                res.add(temp.val);
                if(temp.right!=null) s1.push(temp.right);
                if(temp.left!=null) s1.push(temp.left);
            }
            if(res.size()>0)
                result.add(res);
        }
        return result;
    }
}
