package Leet2018.search.binarysearch;

/**
 * @author bjxujiayi
 * @create 2018-11-01 13:50
 **/
public class Leet81 {
    public boolean search(int[] nums, int target) {
        if(nums.length == 0)
            return false;
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private boolean binarySearch(int[] nums, int target, int start, int end) {
        int mid = (start + end) / 2;
        if(nums[mid] == target)
            return  true;
        else if(start >= end)
            return false;
        return binarySearch(nums, target, mid + 1 , end) || binarySearch(nums, target, start, mid - 1);
    }
}
