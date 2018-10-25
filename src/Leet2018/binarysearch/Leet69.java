package Leet2018.binarysearch;

/**
 * @author bjxujiayi
 * @create 2018-10-25 10:13
 **/
public class Leet69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(9));
    }
    public static int mySqrt(int x) {
        if(x < 0)
            return -1;
        if(x == 0)
            return 0;
        int l = 0, r = x;
        int m  = 0;
        while(l <= r){
            m = (l + r)/2;
            if(x/(m+1)<(m+1) && x/m >= m){
                break;
            }
            if(x/(m+1) >= (m+1)){
                l = m + 1;
            }else{
                r = m - 1;
            }
        }
        return m;
    }
}
