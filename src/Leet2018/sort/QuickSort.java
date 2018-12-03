package Leet2018.sort;

/**
 * https://blog.csdn.net/Yexiaofen/article/details/78018204
 * @author bjxujiayi
 * @create 2018-12-03 13:44
 **/
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,1,2,6,3,5,5};
        quickSort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
    public static void quickSort(int[] arr){
        sort(0, arr.length - 1, arr);
    }

    private static void sort(int start, int end, int[] arr) {
        if(end < start)
            return;
        int i = start, j =end;
        int key = arr[start];
        while(i < j){
            while(arr[j] >= key && i < j){
                j --;
            }
            while(arr[i] <= key && i < j){
                i++;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        int temp = arr[start];
        arr[start] = arr[i];
        arr[i] = temp;
        sort(start, i - 1, arr);
        sort(i + 1, end, arr);
    }
}
