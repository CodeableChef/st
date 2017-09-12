package list;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by yuwang on 2017/4/20.
 */
public class ListTest<E> {

    /**
     * 验证list中元素的起始index，为0
     * @param list
     * @param e
     * @return
     */
    int listIndexTest(List<E> list, E e) {
        int result = list.indexOf(e);
        System.out.println("元素e在List中的index为：" + result);
        return result;
    }

    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        ListTest<Integer> listTest = new ListTest<>();
//        listTest.listIndexTest(list, 1);

        Set<Long> a = new HashSet<>();
//        if(a == null) {
//            System.out.println("a is null");
//        }
        Long b = 30000l;
        a.add(200l);
        a.add(2l);
        a.add(b);
        a.add(b);
        a.add(b);
        System.out.println();

    }
}
