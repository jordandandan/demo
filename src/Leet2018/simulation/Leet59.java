package Leet2018.simulation;

/**
 * @author bjxujiayi
 * @create 2018-10-23 10:52
 **/
public class Leet59 {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int count = 1;
        int r = matrix.length;
        int c = matrix[0].length;
        int row = 0,col = -1;
        while(true){
            for(int i=0;i<c;i++){
                col++;
                matrix[row][col] = count;
                count ++;
            }
            if(--r == 0){
                break;
            }
            for(int i=0;i<r;i++){
                row++;
                matrix[row][col] = count;
                count++;
            }
            if(--c ==0){
                break;
            }
            for(int i =0;i<c;i++){
                col--;
                matrix[row][col] = count;
                count++;
            }
            if(--r ==0){
                break;
            }
            for(int i =0;i<r;i++){
                row--;
                matrix[row][col] = count;
                count ++;
            }
            if(--c ==0){
                break;
            }
        }
        return  matrix;
    }
}
