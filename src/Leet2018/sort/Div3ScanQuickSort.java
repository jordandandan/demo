package Leet2018.sort;

/**
 * 三分单向扫描快排
 * 解决重复元素过多快排无法较好的partition问题
 * https://blog.csdn.net/Holmofy/article/details/71168530
 * @author bjxujiayi
 * @create 2018-12-03 17:45
 **/
public class Div3ScanQuickSort {
    public static void main(String[] args) {
        int[] arr = {5,1,2,6,3,5,5};
        quickSort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
    public static void quickSort(int[] arr){
        div3ScanSort(0, arr.length - 1, arr);
    }

    private static void div3ScanSort(int start, int end, int[] arr) {
        if(start > end){
            return;
        }
        int i = start, k = start + 1, j = end;
        int pivot = arr[start];
        while(k <= j){
            if(arr[k] < pivot){
                swap(arr, i , k);
                i++;
                k++;
            }else if(arr[k] > pivot){
                swap(arr, j, k);
                j--;
            }else{
                k ++;
            }
        }
        div3ScanSort(start, i - 1, arr);
        div3ScanSort(j + 1, end, arr);
    }

    private static void swap(int[] arr, int i, int k) {
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }
}
