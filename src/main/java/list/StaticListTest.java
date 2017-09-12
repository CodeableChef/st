package list;

import comparator.CT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yuwang on 2017/5/3.
 */
public class StaticListTest {
    /**
     * 静态集合怎么操作都会改变原有值
     */
    static List<CT> cts = new ArrayList<>();

    public static List<CT> copyCTs(List<CT> cts) {
        CT[] ctArray = cts.toArray(new CT[0]);
        List<CT> ct = Arrays.asList(ctArray);
        for(CT c : ct) {
            c.setId(0);
        }
        return ct;
    }
    public static void main(String[] args) {
        CT c1 = new CT(1,2,3);
        CT c2 = new CT(1,2,3);
        cts.add(c1);
        cts.add(c2);
        List<CT> c = copyCTs(cts);
        System.out.println(c);
        System.out.println(cts);

        List<Long> l;
    }
}
