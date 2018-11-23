package Leet2018.bit;

/**
 * @author bjxujiayi
 * @create 2018-11-23 11:05
 **/
public class Leet137 {
    public int singleNumber(int[] nums) {
        int[] a = new int[32];
        for(int num : nums){
            for(int j = 0;j<32;j++){
                if((num & (1<<j)) != 0){
                    a[j] = (a[j] + 1) % 3;
                }
            }
        }
        int res = 0;
        for(int j = 0; j< 32; j++){
            if(a[j] != 0){
                res |= (1<<j);
            }
        }
        return res;
    }
}
