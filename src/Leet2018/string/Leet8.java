package Leet2018.string;

/**
 * @author bjxujiayi
 * @create 2018-10-09 14:53
 **/
public class Leet8 {
    public static void main(String[] args) {
        System.out.println(myAtoi("2147483648"));
    }
    public static int myAtoi(String str) {

        int maxDiv10 = Integer.MAX_VALUE/10;
        str = str.trim();
        if(str.equals(""))
            return 0;
        int sign = 1;
        int i =0, len = str.length(), res = 0;
        if(str.charAt(i) == '+'){
            i++;
        }else if(str.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        while(i<len && Character.isDigit(str.charAt(i))){
            if(res > maxDiv10){
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            res = res * 10 + Character.getNumericValue(str.charAt(i));
            i++;
        }
        return res*sign;
    }
}
