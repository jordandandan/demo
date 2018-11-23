package Leet2018.bit;

/**
 * @author bjxujiayi
 * @create 2018-11-23 11:03
 **/
public class Leet136 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int num : nums){
            res ^= num;
        }
        return res;
    }
}
