package Leet2018.binarysearch;

/**
 * @author bjxujiayi
 * @create 2018-10-25 13:58
 **/
public class Leet74 {
    public static void main(String[] args) {
        int[][] matrix = {{1,3}};
        System.out.println(searchMatrix(matrix, 3));
    }
    public static  boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if(m == 0){
            return false;
        }
        int i  =0;
        for(; i<m ;i++){
            if(i == m - 1 || ((target >=matrix[i][0]) && (target < matrix[i+1][0]))){
                break;
            }
        }
        return binarySearch(matrix[i], target);
    }

    private static boolean binarySearch(int[] matrix, int target) {
        int l = 0, r = matrix.length - 1;
        while(l<=r){
            int mid = (l+r)/2;
            if(matrix[mid] == target){
                return true;
            }else if(matrix[mid] < target){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return false;
    }
}
