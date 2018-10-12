package Leet2018;

/**
 * @author bjxujiayi
 * @create 2018-10-10 14:42
 **/
public class Leet14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<strs.length;i++){
            min = Math.min(min, strs[i].length());
        }
        int left = 1, right = min;
        while(left <= right){
            int mid = (left + right)/2;
            if(isCommon(strs, mid)){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return strs[0].substring(0, (left + right)/2);
    }
    private boolean isCommon(String[] strs, int mid){
        String prefix = strs[0].substring(0, mid);
        for(int i =1;i<strs.length;i++){
            if(strs[i].indexOf(prefix) !=0 ){
                return false;
            }
        }
        return true;
    }
}
