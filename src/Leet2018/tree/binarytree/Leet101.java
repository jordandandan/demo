package Leet2018.tree.binarytree;

/**
 * @author bjxujiayi
 * @create 2018-11-07 17:22
 **/
public class Leet101 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }

        if(left.val == right.val){
            return isMirror(left.left, right.right) && isMirror(left.right, right.left);
        }else{
            return false;
        }
    }
}
