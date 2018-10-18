package Leet2018.math;

/**
 * @author bjxujiayi
 * @create 2018-10-09 15:20
 **/
public class Leet9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1000021));
    }
    public static boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int div = 1;
        while(x/div >=10){
            div *= 10;
        }
        while(x!=0){
            int l = x/div;
            int r = x%10;
            if(l != r){
                return false;
            }
            x = (x%div)/10;
            div /=100;
        }
        return true;
    }
}
