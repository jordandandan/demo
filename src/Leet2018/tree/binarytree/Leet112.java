package Leet2018.tree.binarytree;

/**
 * @author bjxujiayi
 * @create 2018-11-13 15:49
 **/
public class Leet112 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        int temp = root.val;
        return isValid(root, sum, temp);
    }

    private boolean isValid(TreeNode root, int sum, int temp) {
        if(root.left == null && root.right==null){
            return sum == temp;
        }
        if(root.left == null){
            return isValid(root.right, sum, temp + root.right.val);
        }
        if(root.right == null){
            return isValid(root.left, sum, temp + root.left.val);
        }
        return isValid(root.right, sum, temp + root.right.val) || isValid(root.left, sum, temp  + root.left.val);
    }

}
