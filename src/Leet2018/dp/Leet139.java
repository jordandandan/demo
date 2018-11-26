package Leet2018.dp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author bjxujiayi
 * @create 2018-11-26 14:09
 **/
public class Leet139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<String>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for(int i = 1;i<=s.length();i++){
            for(int j = 0;j<i;j++){
                if(dp[j] && dict.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];

    }
}
