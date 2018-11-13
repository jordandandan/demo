package Leet2018.tree.binarytree;

/**
 * @author bjxujiayi
 * @create 2018-11-13 11:05
 **/
public class Leet111 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    //recursion
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        if(root.left==null)
            return minDepth(root.right)+1;
        if(root.right==null)
            return minDepth(root.left)+1;
        return Math.min(minDepth(root.left), minDepth(root.right))+1;
    }


}
