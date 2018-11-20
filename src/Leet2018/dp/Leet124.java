package Leet2018.dp;

/**
 * @author bjxujiayi
 * @create 2018-11-20 14:59
 **/
public class Leet124 {
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
      TreeNode(int x) { val = x; }
  }
    private int max;
    public int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
        findMax(root);
        return max;
    }
    public int findMax(TreeNode p){
        if(p == null)
            return 0;
        int left = findMax(p.left);
        int right = findMax(p.right);
        max = Math.max(p.val+left+right, max);
        int ret = p.val+Math.max(left, right);
        return ret>0?ret:0;
    }
}
