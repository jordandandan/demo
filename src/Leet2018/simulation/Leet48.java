package Leet2018.simulation;

/**
 * @author bjxujiayi
 * @create 2018-10-19 10:43
 **/
public class Leet48 {
    public void rotate(int[][] matrix) {
        int n = matrix[0].length;
        if(n == 1)
            return;
        for(int i =0 ; i< n/2;i++){
            for(int j = 0; j< Math.ceil((double)n/2.0);j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-j-1][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = temp;
            }
        }
    }
}
