package javabasic;

import comparator.CT;

import java.util.List;

/**
 * Created by yuwang on 2017/6/5.
 */
public class SwitchCaseTest {
    public static CT l;
    public static CT l0 = new CT();
    public static void main(String[] args) {
        int a = 10;
        switch (a) {
            case 1 :
                System.out.println(1);
                break;
            case 2 :
                System.out.println(2);
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println(5);
                break;
            default:
                System.out.println(6);
        }
        if(l == null)
            System.out.println(true);
        if(l0.getDesc() == null)
            System.out.println(true);
        Boolean b = true;
        System.out.println("Object Boolean toString is " + b.toString());
        System.out.println();
    }
}
