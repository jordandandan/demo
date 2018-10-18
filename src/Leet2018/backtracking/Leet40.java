package Leet2018.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author bjxujiayi
 * @create 2018-10-18 11:22
 **/
public class Leet40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        Arrays.sort(candidates);
        int start = 0;
        backTracking(candidates, target, temp ,res,start);
        return res;
    }
    private void backTracking(int[] candidates, int target, List<Integer> temp, List<List<Integer>> res, int start){
        if(target == 0){
            List<Integer> tempList = new ArrayList<Integer>(temp);
            res.add(tempList);
            return;
        }
        for(int i = start; i< candidates.length; i++){
            if(candidates[i] > target){
                break;
            }
            if(i > start && candidates[i] == candidates[i - 1])
                continue;
            temp.add(candidates[i]);
            backTracking(candidates, target - candidates[i], temp, res, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
