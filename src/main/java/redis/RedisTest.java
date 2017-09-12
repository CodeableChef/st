package redis;

import redis.clients.jedis.Jedis;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yuwang on 2017/4/13.
 */
public class RedisTest {
    public static void main(String[] args) throws URISyntaxException {
        Jedis jedis = new Jedis("localhost");
//        jedis.set("fruit", "apple");
//        System.out.println(jedis.get("fruit"));
//        jedis.select(15);

        /**
         *  该测试表明，列表中的元素依次从左侧插入，即第一次插入时list中的元素
         */
//        jedis.lpush("fruits", "apple", "banana", "orange");
//        System.out.println(jedis.llen("fruits"));
//        for(String str : jedis.lrange("fruits", 0,11)) {
//            System.out.println(str);
//        }
//    jedis.hset("firsthash", "field1", "val1");
//    Map<String, String> map = new HashMap<>();
//    map.put("f1", "v1");
//    map.put("f2", "v1");
//    map.put("f3", "v3");
//    jedis.hmset("secondhash", map);
//        jedis.hset("firsthash", "field1", "v2");
//        jedis.hset("firsthash", "field2", "v2");
        jedis.zadd("zset", 100d, "m1");
        Map<String,Double> map = new HashMap<>();
        map.put("m2", 10d);
        map.put("m3", 20d);
        jedis.zadd("zset", map);
    }
}
