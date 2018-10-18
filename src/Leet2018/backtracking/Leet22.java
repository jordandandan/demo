package Leet2018.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bjxujiayi
 * @create 2018-10-16 17:40
 **/
public class Leet22 {
    public List<String> generateParenthesis(int n) {
        String temp = "";
        List<String> result = new ArrayList<String>();
        backTracking(n,n,temp,result);
        return result;
    }
    private void backTracking(int left, int right, String temp, List<String> result){
        if(left==0&&right==0){
            result.add(temp);
            return;
        }
        if(left>0){
            backTracking(left-1,right,temp+"(",result);
        }
        if(right>0 && left<right){
            backTracking(left,right-1,temp+")",result);
        }
    }
}
