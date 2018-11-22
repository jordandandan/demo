package Leet2018.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bjxujiayi
 * @create 2018-11-22 13:32
 **/
public class Leet131 {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<List<String>>();
        int start = 0;
        List<String> temp = new ArrayList<String>();
        bactracking(res, start, temp, s);
        return res;
    }

    private void bactracking(List<List<String>> res, int start, List<String> temp, String s) {
        if(start == s.length()){
            res.add(temp);
            return;
        }
        for(int i = start + 1;i<= s.length();i++){
            if(isPali(s.substring(start, i))){
                List<String> newTemp = new ArrayList<String>(temp);
                newTemp.add(s.substring(start,i));
                bactracking(res, i, newTemp, s);
            }
        }
    }

    private boolean isPali(String substring) {
        int i = 0, j = substring.length() - 1;
        for(;i<j;i++,j--){
            if(substring.charAt(i) != substring.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
