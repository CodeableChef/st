package statictest;

/**
 * Created by yuwang on 2017/6/29.
 */
public class StaticTest {

//    public static  int a = 0;
//    public static  int b = 0;
//
//    public static int getB() {
//        return b;
//    }
//
//    public static void setB(int b) {
//        StaticTest.b = b;
//    }
    public static DB fillDB(DB db){
        DB dbnew = new DB();
        dbnew.driver=db.driver;
        dbnew.url=db.url;
        dbnew.username=db.username;
        dbnew.password=db.password;
        return dbnew;
    }

    public static void main(String[] args) {
        DB db = new DB();
        db.setDriver("1");
        db.setDriver("2");
        db.setUsername("3");
        db.setPassword("4");

        System.out.println();
    }
}
