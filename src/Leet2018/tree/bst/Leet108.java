package Leet2018.tree.bst;

/**
 * @author bjxujiayi
 * @create 2018-11-12 12:11
 **/
public class Leet108 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return generate(0, nums.length - 1, nums);
    }

    private TreeNode generate(int start, int end, int[] nums) {
        if(start > end){
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = generate(start, mid - 1, nums);
        root.right = generate(mid + 1, end, nums);
        return root;
    }
}
