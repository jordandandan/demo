package Leet2018.twopointers;

/**
 * @author bjxujiayi
 * @create 2018-11-01 12:12
 **/
public class Leet80 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0||nums.length==1)
            return nums.length;
        int head = 0;
        int res = 1;
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            if(i==0||nums[i]!=nums[i-1]){
                cnt = 1;
            }
            else
                cnt++;
            if(cnt<3)
                nums[head++] = nums[i];
        }
        return head;
    }
}
