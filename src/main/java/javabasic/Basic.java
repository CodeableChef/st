package javabasic;

/**
 * Created by yuwang on 2017/6/14.
 */
public class Basic {
    public static void main(String[] args) {
        A a = new A();
        a.a = 1;
        int b = a.a;
        int c;
        int d;
        Long start1 = System.currentTimeMillis();
        for(int i=0; i<1000000; i++){
            c=a.getA();
        }
        Long end1 = System.currentTimeMillis();
        System.out.println("时间1: " + (end1 - start1));
        Long start2 = System.currentTimeMillis();
        for(int i=0; i<1000000; i++){
            d=b;
        }
        Long end2 = System.currentTimeMillis();
        System.out.println("时间2: " + (end2 - start2));

        long test1 = 200l;
//        A test2 = new A();
        long test2 = 200l;
        System.out.println(test1 == test2);
    }
}
