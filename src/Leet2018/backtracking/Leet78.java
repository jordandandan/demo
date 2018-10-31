package Leet2018.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bjxujiayi
 * @create 2018-10-31 11:26
 **/
public class Leet78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        int start = 0;
        backTrack(nums, temp, res, start);
        return res;
    }

    private void backTrack(int[] nums, List<Integer> temp, List<List<Integer>> res, int start) {
        res.add(new ArrayList<Integer>(temp));
        for(int i = start; i< nums.length ;i ++){
            temp.add(nums[i]);
            backTrack(nums, temp, res, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
