package Leet2018.tree.bst;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bjxujiayi
 * @create 2018-11-07 11:35
 **/
public class Leet98 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isValidBST(TreeNode root) {
        List<Integer> inOrderValList = new ArrayList<Integer>();
        inOrderTravelal(root, inOrderValList);
        for(int i = 1; i< inOrderValList.size(); i++){
            if(inOrderValList.get(i) <= inOrderValList.get(i - 1)){
                return false;
            }
        }
        return true;
    }

    private void inOrderTravelal(TreeNode root, List<Integer> inOrderValList) {
        if(root == null){
            return;
        }
        inOrderTravelal(root.left, inOrderValList);
        inOrderValList.add(root.val);
        inOrderTravelal(root.right, inOrderValList);
    }


}
