package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by yuwang on 2017/4/25.
 */
public class ComparatorTest implements Comparator {

    /**
     * 通过Object的三个维度排序,类似于sql中order by多个字段
     * 可用于实现java查询
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(Object o1, Object o2) {
        CT ct1 = (CT) o1;
        CT ct2 = (CT) o2;
        int result = ct1.getId() - ct2.getId();
        if(result == 0) {
            result = ct1.getId1() - ct2.getId1();
            if(result == 0) {
                result = ct1.getId2() - ct2.getId2();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        CT ct1 = new CT(1, 1, 1);
        CT ct2 = new CT(1, 2, 1);
        CT ct3 = new CT(1, 3, 1);
        CT ct4 = new CT(1, 2, 3);
        CT ct5 = new CT(2, 1, 1);
        CT ct6 = new CT(2, 1, 5);
        CT ct7 = new CT(2, 2, 3);
        CT ct8 = new CT(2, 2, 4);
        CT ct9 = new CT(1, 4, 1);
        CT ct10 = new CT(3, 1, 1);
        CT ct11 = new CT(4, 1, 1);
        CT ct12 = new CT(5, 1, 1);
        CT ct13 = new CT(3, 1, 2);
        CT ct14 = new CT(4, 2, 1);
        List<CT> list = new ArrayList<>();
        list.add(ct14);
        list.add(ct13);
        list.add(ct12);
        list.add(ct11);
        list.add(ct10);
        list.add(ct9);
        list.add(ct8);
        list.add(ct7);
        list.add(ct6);
        list.add(ct5);
        list.add(ct4);
        list.add(ct3);
        list.add(ct2);
        list.add(ct1);
        Collections.sort(list, new ComparatorTest());
        System.out.println();
    }
}
