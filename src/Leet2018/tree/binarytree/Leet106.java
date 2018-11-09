package Leet2018.tree.binarytree;

/**
 * @author bjxujiayi
 * @create 2018-11-09 11:04
 **/
public class Leet106 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length==0)
            return null;
        TreeNode root= construtct(inorder,postorder,inorder.length-1,0,postorder.length-1);
        return root;
    }
    private TreeNode construtct(int[] inorder, int[] postorder, int inStart, int inEnd,int postStart) {
        if(inStart<inEnd||postStart<0)
            return null;
        TreeNode root = new TreeNode(postorder[postStart]);
        int index = -1;
        for(int i=inStart;i>=inEnd;i--){
            if(inorder[i]==root.val)
                index = i;
        }
        root.right = index==-1?null:construtct(inorder, postorder, inStart, index+1, postStart-1);
        root.left = index==-1?null:construtct(inorder, postorder,index-1 , inEnd, postStart-(inStart-index)-1);
        return root;

    }
}
