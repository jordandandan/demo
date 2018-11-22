package Leet2018.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bjxujiayi
 * @create 2018-11-22 10:56
 **/
public class Leet129 {
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }
    public int sumNumbers(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null){
            res.add(0);
        }else{
            dfs(root, 0, res);
        }
        int result = 0;
        for(int num : res){
            result += num;
        }
        return result;
    }

    private void dfs(TreeNode root, int temp, List<Integer> res) {
        temp = temp*10 + root.val;
        if(root.left == null && root.right == null){
            res.add(temp);
            return;
        }
        if(root.left != null){
            dfs(root.left, temp, res);
        }
        if(root.right != null){
            dfs(root.right, temp, res);
        }
    }
}
