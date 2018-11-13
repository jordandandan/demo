package Leet2018.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bjxujiayi
 * @create 2018-11-13 17:00
 **/
public class Leet113 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        if(root == null)
            return res;
        backTracking(sum, root, res, temp);
        return res;
    }

    private void backTracking(int sum,  TreeNode root, List<List<Integer>> res, List<Integer> temp) {
        if(root.left == null && root.right==null){
            if(root.val == sum){
                List<Integer> tempList = new ArrayList<Integer>(temp);
                tempList.add(root.val);
                res.add(tempList);
            }
            return;
        }
        temp.add(root.val);
        if(root.left != null){
            backTracking(sum - root.val, root.left, res, temp);
        }
        if(root.right != null){
            backTracking(sum - root.val, root.right, res, temp);
        }
        temp.remove(temp.size() - 1);
    }
}
