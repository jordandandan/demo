package Leet2018.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bjxujiayi
 * @create 2018-10-19 10:34
 **/
public class Leet47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        backtrack(res, new ArrayList<Integer>(), 0, nums);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> temp, int start, int[] nums){
        if(temp.size() == nums.length){
            res.add(new ArrayList<Integer>(temp));
            return ;
        }
        int k = 0;
        for(int i=0;i<temp.size();i++){
            if(temp.get(i) == nums[start])
                k = i+1;
        }
        for(int i=k;i<=temp.size();i++){
            temp.add(i, nums[start]);
            backtrack(res, temp, start+1, nums);
            temp.remove(i);
        }


    }
}
