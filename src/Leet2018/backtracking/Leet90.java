package Leet2018.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author bjxujiayi
 * @create 2018-11-02 11:41
 **/
public class Leet90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        int start = 0;
        Arrays.sort(nums);
        backTracking(nums, start, res, temp);
        return res;
    }

    private void backTracking(int[] nums, int start, List<List<Integer>> res, List<Integer> temp) {
        res.add(new ArrayList<Integer>(temp));
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i - 1]){
                continue;
            }
            temp.add(nums[i]);
            backTracking(nums, i + 1, res, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
