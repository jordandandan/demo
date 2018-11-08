package Leet2018.tree.binarytree;

/**
 * @author bjxujiayi
 * @create 2018-11-07 12:07
 **/
public class Leet100 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean res = false, left = false, right = false;
        if(p == null && q == null){
            res = true;
        }else if((p == null && q != null ) || (p != null && q == null) ){
            res =  false;
        }else if(p.val != q.val){
            res = false;
        }else{
            res = true;
        }
        if(res && p!=null && q !=null){
            res = isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return res;
    }
}
