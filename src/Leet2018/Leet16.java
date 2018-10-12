package Leet2018;

import java.util.Arrays;

/**
 * @author bjxujiayi
 * @create 2018-10-10 16:37
 **/
public class Leet16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE, near = 0;
        for(int i =0; i<nums.length;i++){
            int a = nums[i];
            int start = i + 1, end = nums.length - 1;
            while(start< end){
                int sum = nums[start] + nums[end] + a;
                if(Math.abs(sum - target) < diff){
                    diff = Math.abs(sum - target);
                    near = sum;
                }
                if(sum > target){
                    end --;
                }else if( sum < target){
                    start ++;
                }else{
                    return target;
                }
            }
        }
        return near;
    }
}
