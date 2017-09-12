package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by yuwang on 2017/4/24.
 */
public class StreamTest {
    public static void main(String[] args) {
        STest test1 = new STest(1l,2l);
        STest test2 = new STest(2L, 3L);
        List<STest> testlist = new ArrayList<>();
        testlist.add(test1);
        testlist.add(test2);
//        Map<Long, STest> map = testlist.stream().collect(Collectors.toMap(STest :: getKey, Function.identity()));
//        map.forEach((k, v) -> System.out.println(k + " => " + v));
    }
}
