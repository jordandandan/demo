package Leet2018.tree.binarytree;

/**
 * @author bjxujiayi
 * @create 2018-11-09 10:25
 **/
public class Leet105 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0){
            return null;
        }
        return construct(0,0, inorder.length - 1, preorder, inorder);
    }

    private TreeNode construct(int preStart, int inStart, int inEnd,
                               int[] preorder, int[] inorder) {
        if(preStart >= preorder.length || inStart > inEnd)
            return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int inIdex = 0;
        for(int i = inStart; i <= inEnd; i++){
            if(inorder[i] == root.val){
                inIdex = i;
                break;
            }
        }
        root.left = construct(preStart + 1, inStart, inIdex - 1 ,
                preorder, inorder);
        root.right = construct(preStart + inIdex - inStart + 1, inIdex + 1, inEnd,
                preorder, inorder);
        return root;
    }
}
