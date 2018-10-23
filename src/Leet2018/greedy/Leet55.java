package Leet2018.greedy;

/**
 * @author bjxujiayi
 * @create 2018-10-22 11:28
 **/
public class Leet55 {
    public boolean canJump(int[] nums) {
        if(nums.length <= 1){
            return true;
        }
        boolean result = false;
        int reachIndex = nums.length - 1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i] + i >= reachIndex){
                reachIndex = i;
                result = true;
            }else{
                result = false;
            }
        }
        return result;
    }
}
