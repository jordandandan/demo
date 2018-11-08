package Leet2018.tree.bst;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bjxujiayi
 * @create 2018-11-06 14:04
 **/
public class Leet95 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<TreeNode> generateTrees(int n) {
        if(n == 0){
            return new ArrayList<TreeNode>();
        }
        return generate(1,n);
    }

    private List<TreeNode> generate(int start, int end) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        if(start > end){
            list.add(null);
            return list;
        }
        for(int rootVal = start; rootVal<=end; rootVal++){
            List<TreeNode> leftSubTree = generate(start, rootVal - 1);
            List<TreeNode> rightSubTree = generate(rootVal + 1, end);
            for(TreeNode left : leftSubTree){
                for(TreeNode right : rightSubTree){
                    TreeNode root = new TreeNode(rootVal);
                    root.right = right;
                    root.left = left;
                    list.add(root);
                }
            }
        }
        return list;
    }
}
