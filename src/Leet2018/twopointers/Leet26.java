package Leet2018.twopointers;

/**
 * @author bjxujiayi
 * @create 2018-10-16 19:48
 **/
public class Leet26 {
    public int removeDuplicates(int[] nums) {
        int prev = 0, after = 1;
        if(nums.length < 2){
            return nums.length;
        }
        while(after<nums.length){
            if(nums[after] == nums[prev]){
                after++;
                continue;
            }else{
                nums[++prev] = nums[after];
                after++;
            }
        }
        return prev+1;
    }
}
