package Leet2018.simulation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bjxujiayi
 * @create 2018-10-22 10:13
 **/
public class Leet54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0,col = -1;
        while(true){
            for(int i=0;i<n;i++){
                col++;
                result.add(matrix[row][col]);
            }
            if(--m == 0){
                break;
            }
            for(int i=0;i<m;i++){
                row++;
                result.add(matrix[row][col]);
            }
            if(--n ==0){
                break;
            }
            for(int i =0;i<n;i++){
                col--;
                result.add(matrix[row][col]);
            }
            if(--m ==0){
                break;
            }
            for(int i =0;i<m;i++){
                row--;
                result.add(matrix[row][col]);
            }
            if(--n ==0){
                break;
            }
        }
        return  result;
    }
}
