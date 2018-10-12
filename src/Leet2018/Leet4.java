package Leet2018;

/**
 * @author bjxujiayi
 * @create 2018-10-09 12:09
 **/
public class Leet4 {
    public String longestPalindrome(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        int result = -1;
        String pali = "";
        for(int i = len-1;i>=0;i--){
            for(int j = i; j<len;j++){
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j-i<3 || dp[i+1][j-1]);
                if(dp[i][j] && j-i+1 >result){
                    result = j-i+1;
                    pali = s.substring(i,j+1);
                }
            }

        }
        return pali;
    }
}
