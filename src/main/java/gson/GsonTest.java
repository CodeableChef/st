package gson;

import com.google.gson.Gson;

/**
 * Created by yuwang on 2017/6/14.
 */
public class GsonTest {
    public static Gson gson = new Gson();
    public static void main(String[] args) {
        String time = "{‘time’:'2015-10-08 11:14:28'}";
        A a = gson.fromJson(time, A.class);
        System.out.println();
    }
}
