package Leet2018.math;

/**
 * @author bjxujiayi
 * @create 2018-10-24 11:36
 **/
public class Leet66 {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        digits[len-1]+=1;
        boolean add = false;
        int[] digit = new int[len+1];
        if(digits[len-1]==10){
            add = true;
            digits[len-1] = 0;
            for(int i=len-2;i>=0;i--){
                if(add){
                    digits[i]++;
                    add = false;
                }

                if(digits[i]==10){
                    add = true;
                    digits[i] = 0;
                }

            }
            if(add){

                digit[0] = 1;
                for(int i=0;i<len;i++){
                    digit[i+1] = digits[i];
                }
                return digit;
            }
        }
        return digits;

    }
}
