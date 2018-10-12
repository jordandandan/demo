package Leet2018;

/**
 * @author bjxujiayi
 * @create 2018-10-09 14:22
 **/
public class Leet7 {
    public int reverse(int x) {
        int res = 0;
        int tmp;
        while(x!=0){
            if(Math.abs(x) > Integer.MAX_VALUE)
                res += (x%10);
            res *= 10;
            x /= 10;
        }
        return res;
    }
}
