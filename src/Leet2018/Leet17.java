package Leet2018;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bjxujiayi
 * @create 2018-10-10 16:45
 **/
public class Leet17 {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if(digits == null || digits.length()==0){
            return res;
        }
        String[] letter = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int index = 0;
        int start = digits.charAt(index)-'2';
        int l = digits.length();
        String temp = "";
        backTracking(temp, letter, l, start,res, digits, index);
        return res;
    }
    private void backTracking(String temp, String[] letter, int l , int start, List<String> res, String digits, int index){
        if(l == 0){
            String t = new String(temp);
            res.add(temp);
            return;
        }
        for(int i = 0;i<letter[start].length();i++){
            temp += letter[start].charAt(i);
            int t_start = start;
            if(index < digits.length()-1)
                start =  digits.charAt(index + 1)-'2';
            backTracking(temp, letter, l-1, start, res, digits, index+1);
            start = t_start;
            temp = temp.substring(0, temp.length()-1);
        }
    }
}
