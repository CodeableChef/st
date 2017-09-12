package map;

import java.util.*;

/**
 * Created by yuwang on 2017/5/5.
 */
public class MapTest {
    public static void main(String[] args) {
        /**
         * 将map中的value取出来放到list中的正确写法,注意不能cast！
         */
        Map<Long, String> map = new TreeMap<>();
        map.put(1l, "1");
        map.put(3l, "3");
        map.put(2l, "2");
//        错误示范：
//        List<String> test = (List<String>) map.values();
        List<String> test = new ArrayList<>(map.values());
        System.out.println();

        /**
         * 当map为空时，取size会报空指针异常
         */
        Map<Long, String> map0 = null;
        if(map0.size() > 0) {
            System.out.println();
        }
    }
}
