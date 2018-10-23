package Leet2018.backtracking;

/**
 * @author bjxujiayi
 * @create 2018-10-19 11:34
 **/
public class Leet50 {
    public double myPow(double x, int n) {
        if(n==Integer.MIN_VALUE)//|Max_Value| + 1 = |MinValue| :-2^31~2^31-1
            return myPow(1/x,Integer.MAX_VALUE)*1/x;
        if(n==0)
            return 1;
        if(n<0){
            x = 1/x;
            n = -n;
        }
        return n%2==0?myPow(x*x, n/2):x*myPow(x, n-1);
    }
}
