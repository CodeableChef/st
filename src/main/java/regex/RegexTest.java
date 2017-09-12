package regex;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yuwang on 2017/6/24.
 */
public class RegexTest {
    public static void main(String[] args) {
        String str = "sdfsadassf";
        String pattern = "(?<=\\{)(\\w+?)(?=\\})";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        while (m.find()){
            System.out.println(1);
            System.out.println(m.group());
            System.out.println(m.group());
        }
    }
}
