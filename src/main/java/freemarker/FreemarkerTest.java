package freemarker;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.StringWriter;
//import java.util.Date;
import java.sql.Date;
import java.sql.Time;
import java.util.HashMap;
import java.util.Map;

/**
 * some test for freemarker
 * Created by yuwang on 2017/5/5.
 */
public class FreemarkerTest {
    private static Configuration config;

    static {
        config = new Configuration();
    }

    private synchronized static Template getTemplate(String tpl)
            throws Exception {
        config.setTemplateLoader(new StringTemplateLoader(tpl));
        config.setDefaultEncoding("UTF-8");
        Template template = config.getTemplate("");
        return template;
    }

    public static String getText(String tpl, Map<String, Object> root)
            throws Exception {
        Template template = getTemplate(tpl);
        StringWriter writer = new StringWriter();
        template.process(root, writer);
        return writer.toString();
    }
    public static void main(String[] args) throws Exception {
//        String sql = "<#list a[2] as item>${item}</#list>${a[2]?size}2156/5351/7143?startDate=${dataValue}&endDate=${dataValue}";
//        String sql = "<#if auth_test?? && auth_test[2]?size gt 0>\n" +
//                "\t'${auth_test[2][0]}, ${auth_test[1][0]}, ${auth_test[0][0]}'\n" +
//                "    <#elseif auth_test?? && auth_test[1]?size gt 0>\n" +
//                "    '${auth_test[1][0]}, ${auth_test[0][0]}'\n" +
//                "    <#elseif auth_test?? && auth_test[0]?size gt 0>\n" +
//                "    '${auth_test[0][0]}'\n" +
//                "</#if>";
//        String sql = "   <#if cascade_test[0]?size gt 0 && cascade_test[1]?size==0>\n" +
//                "     'AND', ',' ${cascade_test[0][0]}\n" +
//                "   </#if>";

        String sql = "${a}";
//        int[][] cascade_test = {{1}, {}};

//        for(int i : a[2]){
//            System.out.println(i);
//        }
//        try{
            Map<String, Object> root = new HashMap<>();
        root.put("a", null);
//        root.put("dataValue", "2");
//        root.put("block", "R:274153212");
//        root.put("a1", 1);
//        root.put("a2", 2);
//            String execSQL = getText(sql, root);
//            System.out.println(execSQL);
//        } catch (InvalidReferenceException e) {
//            System.out.println("wrong");
//            System.out.println(e.getMessage());
//        }
//        System.out.println("wrong1");
        String execSQL = getText(sql, root);
        System.out.println(execSQL);
    }
}
