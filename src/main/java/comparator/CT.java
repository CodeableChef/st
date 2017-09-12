package comparator;

/**
 * Created by yuwang on 2017/4/25.
 */
public class CT {
    int id;
    int id1;
    int id2;
    String desc;
    String desc2;

    public CT(){

    }

    public CT(int id, int id1, int id2) {
        this.id = id;
        this.id1 = id1;
        this.id2 = id2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc2() {
        return desc2;
    }

    public void setDesc2(String desc2) {
        this.desc2 = desc2;
    }

    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }
}
