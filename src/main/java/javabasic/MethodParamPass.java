package javabasic;

/**
 * Created by WangDaYu on 2017/5/18.
 */
public class MethodParamPass {
//    public static void main(String[] args) {
//        int a;
//        int b;
//        StringBuffer c;
//        StringBuffer d;
//        a = 0;
//        b = a;
//        c = new StringBuffer("This is c");
//        d = c;
//        a = 2;
//        c.append("!!");
//        System.out.println("a=" + a);
//        System.out.println("b=" + b);
//        System.out.println("c=" + c);
//        System.out.println("d=" + d);
//    }
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        System.out.println("Before change, sb = " + sb);
        changeData(sb);
        System.out.println("After changeData(n), sb = " + sb);
    }
    public static void changeData(StringBuffer strBuf) {
        StringBuffer sb2 = new StringBuffer("Hi ");
        strBuf = sb2;
        sb2.append("World!");
    }
}
