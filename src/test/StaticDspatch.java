package test;

/**
 * @author bjxujiayi
 * @create 2018-11-21 21:02
 **/
public class StaticDspatch {

    public static void sayHello(Human human){
        System.out.println("hi, human");
    }
    public static void sayHello(Man man){
        System.out.println("hi, man");
    }

    public static void sayHello(Object obj){
        System.out.println("hi, obj");
    }

    public static void main(String[] args) {
        Human man = new Man();
        sayHello((Man)man);
    }
}
