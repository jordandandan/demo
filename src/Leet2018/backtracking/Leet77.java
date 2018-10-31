package Leet2018.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bjxujiayi
 * @create 2018-10-31 11:08
 **/
public class Leet77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        int start = 1;
        backTracking(res, temp, start, k, n);
        return res;
    }

    private void backTracking(List<List<Integer>> res, List<Integer> temp, int start, int k, int n) {
        if(k == 0){
            res.add(new ArrayList<Integer>(temp));
        }
        for(int i=start; i<=n;i++){
            temp.add(i);
            backTracking(res, temp, i+1, k -1, n);
            temp.remove(temp.size() - 1);
        }
    }
}
