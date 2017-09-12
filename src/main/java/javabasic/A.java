package javabasic;

import java.util.*;

/**
 * Created by yuwang on 2017/6/14.
 */
public class A {
    int a;
    Long b = 1l;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
//        String a = "aa,bb,cc,dd";
//        String[] b = a.split(",");
//        System.out.println();
//        Map<Long, String> map = new HashMap<>();
//        map.put(1l,"1");
//        map.put(2l,"2");
//        map.put(3l,"3");
        List<Long> l = new ArrayList<>();
        l.add(1l);
        l.add(2l);
        l.add(3l);
        List<Long> list = new ArrayList<>();
        list.addAll(l);
        l.clear();
        System.out.println();
    }

}
