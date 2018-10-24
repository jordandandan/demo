package Leet2018.dp;

/**
 * @author bjxujiayi
 * @create 2018-10-24 10:09
 **/
public class Leet63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        if(m==0)
            return 0;
        int n = obstacleGrid[0].length;
        if(m==n&&m==1){
            if(obstacleGrid[0][0]==0)
                return 1;
            else
                return 0;
        }
        if(obstacleGrid[m-1][n-1]==1)
            return 0;
        int[][] dp = new int[m+1][n+1];
        for(int i=m-1;i>=1;i--){
            if(obstacleGrid[i-1][n-1]!=1)
                dp[i][n] = 1;
            else
                break;
        }
        for(int i=n-1;i>=1;i--){
            if(obstacleGrid[m-1][i-1]!=1)
                dp[m][i] = 1;
            else
                break;
        }
        for(int i=m-1;i>=1;i--)
            for(int j=n-1;j>=1;j--){
                dp[i][j] = obstacleGrid[i-1][j-1]==0?dp[i+1][j]+dp[i][j+1]:0;
            }
        return dp[1][1];
    }
}
