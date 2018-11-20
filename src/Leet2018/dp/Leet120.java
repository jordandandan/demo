package Leet2018.dp;

import java.util.List;

/**
 * @author bjxujiayi
 * @create 2018-11-20 11:19
 **/
public class Leet120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null || triangle.size() == 0){
            return  0;
        }
        int triangleHeight = triangle.size();
        int[] dp = new int[triangleHeight];
        for(int i = triangleHeight-1; i>=0 ;i--){
            for(int j = 0; j<=i;j++){
                if(i == triangleHeight - 1){
                    dp[j] = triangle.get(i).get(j);
                }else{
                    dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j+1]);
                }
            }
        }
        return dp[0];
    }
}
