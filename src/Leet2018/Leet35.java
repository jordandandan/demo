package Leet2018;

/**
 * @author bjxujiayi
 * @create 2018-10-17 16:44
 **/
public class Leet35 {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int mid;
        while(low < high){
            mid = (low + high)/2;
            if(nums[mid] < target){
                low = mid + 1;
            }else if(nums[mid] > target){
                high = mid - 1;
            }else{
                return mid;
            }
        }
        return nums[low]<target?low + 1:low;
    }
}
