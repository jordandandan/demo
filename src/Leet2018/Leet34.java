package Leet2018;

/**
 * @author bjxujiayi
 * @create 2018-10-17 15:04
 **/
public class Leet34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int[] res = searchRange(nums, 8 );
        for(int i : res){
            System.out.print(i + ",");
        }
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1,-1};
        if(nums.length == 0){
            return res;
        }
        int low = 0;
        int high = nums.length-1;
        while(nums[low]<nums[high]){
            int mid = (high + low)/2;
            if(nums[mid]>target)
                high = mid - 1;
            else if(nums[mid]<target)
                low = mid + 1;
            else{
                if(nums[low] == target)
                    high--;
                else if(nums[high] == target)
                    low++;
                else if(nums[low] != target && nums[high] !=target ){
                    low ++;
                    high --;
                }
            }
        }
        if(nums[low]==target&&nums[high]==target){
            res[0] = low;
            res[1] = high;
        }
        return res;

    }
}
