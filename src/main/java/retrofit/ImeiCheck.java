package retrofit;

/**
 * Created by yuwang on 2017/5/23.
 */
public class ImeiCheck {
    int c_type;
    String ids;

    public ImeiCheck(int c_type, String ids) {
        this.c_type = c_type;
        this.ids = ids;
    }

    public int getC_type() {
        return c_type;
    }

    public void setC_type(int c_type) {
        this.c_type = c_type;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }
}
