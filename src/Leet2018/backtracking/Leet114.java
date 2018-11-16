package Leet2018.backtracking;

/**
 * @author bjxujiayi
 * @create 2018-11-15 10:05
 * https://blog.csdn.net/Jaster_wisdom/article/details/81257773
 **/
public class Leet114 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }

    }
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        while(root.left != null || root.right !=null){
            if(root.left != null){
                TreeNode node = root.left;
                while(node.right!=null){
                    node = node.right;
                }
                node.right = root.right;
                root.right = root.left;
                root.left = null;
            }
            if(root.right != null){
                root = root.right;
            }
        }
    }
}
