package Leet2018.math;

/**
 * @author bjxujiayi
 * @create 2018-10-24 12:09
 **/
public class Leet67 {
    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }
    public static String addBinary(String a, String b) {
        int m = a.length()-1;
        int n = b.length()-1;
        int c = 0 , d = 0, carry = 0;
        StringBuilder res = new StringBuilder();
        while(m>=0 || n>= 0){
            if(m>=0){
                c = Character.getNumericValue(a.charAt(m));
                m --;
            }
            if(n>=0){
                d = Character.getNumericValue(b.charAt(n));
                n--;
            }
            int sum = c ^ d ^ carry;
            carry = (c + d + carry)>1?1:0;
            c = 0;
            d = 0;
            res.append(sum);
        }
        if(carry != 0){
            res.append(carry);
        }
        return res.reverse().toString();
    }
}
