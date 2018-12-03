package Leet2018.sort;

/**
 * @author bjxujiayi
 * @create 2018-12-03 11:28
 **/
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,1,6,3,4};
        mergeSort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
    public static void mergeSort(int[] arr){
        sort(0, arr.length - 1, arr, new int[arr.length]);
    }
    private static void sort(int start, int end, int[] arr, int[] temp){
        if(start >= end){
            return;
        }
        int mid = (start + end) / 2;
        sort(start, mid, arr, temp);
        sort(mid + 1, end, arr, temp);
        merge(start, end, mid, arr, temp);
    }

    private static void merge(int left, int right, int mid, int[] arr, int[] temp) {
        int t = 0;
        int i = left;
        int j = mid + 1;
        while(i<=mid && j<=right){
            temp[t++] = arr[i]<=arr[j]?arr[i++]:arr[j++];
        }
        while(i <= mid){
            temp[t++] = arr[i++];
        }
        while(j <= right){
            temp[t++] = arr[j++];
        }
        t = 0;
        while(left <= right){
            arr[left++] = temp[t++];
        }
    }
}
