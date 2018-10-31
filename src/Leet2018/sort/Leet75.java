package Leet2018.sort;

/**
 * @author bjxujiayi
 * @create 2018-10-31 10:57
 **/
public class Leet75 {
    public void sortColors(int[] nums) {
        int p = 0, q = nums.length - 1;
        for(int i=0;i<nums.length;i++){
            while(nums[i] == 2 && i < q){
                swap(i, q, nums);
                q--;
            }
            while(nums[i] == 0 && i > p){
                swap(i, p, nums);
                p++;
            }
        }

    }

    private void swap(int num, int num1, int[] nums) {
        int temp = nums[num];
        nums[num] = nums[num1];
        nums[num1] =temp;
    }
}
