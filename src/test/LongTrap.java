package test;

/**
 * @author bjxujiayi
 * @create 2018-11-26 17:12
 **/
public class LongTrap {
    public static void main(String[] args) {
        Long a = 127L;
        Long b = 127L;
        System.out.println(a == b);
        Long c = 128L;
        Long d = 128L;
        System.out.println(c == d);
        Long e = 125L;
        Long f = 126L;
        System.out.println(e == f);

        long g = 128L;
        long h = 128L;
        System.out.println(g == h);
    }
}
