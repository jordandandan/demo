package Leet2018.tree.binarytree;

/**
 * @author bjxujiayi
 * @create 2018-11-09 10:00
 **/
public class Leet104 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int maxDepth(TreeNode root) {
        if(root != null){
            return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
        }else{
            return 0;
        }
    }
}
