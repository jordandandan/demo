package Leet2018.dp;

/**
 * @author bjxujiayi
 * @create 2018-10-23 18:16
 **/
public class Leet62 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(7, 3));
    }
    public static int uniquePaths(int m, int n) {
        if(m == 1 || n ==1)
            return 1;
        int[][] dp = new int[n][m];
        for(int i = 0; i< n ;i++){
            dp[i][0] = 1;
        }
        for(int i =0; i< m; i++){
            dp[0][i] = 1;
        }
        for(int i = 1; i< n; i++){
            for(int j = 1; j< m;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[n-1][m-1];
    }
}
