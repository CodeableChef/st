package gson;

import java.util.Date;

/**
 * Created by yuwang on 2017/6/14.
 */
public class A {
    private Long create_user; // 创建人编号
    private String create_user_name; // 创建人姓名
    private Date create_time; // 创建时间
    private Long last_modifier; // 最后修改人编号
    private String last_modifier_name; // 最后修改人姓名
    private Date last_modify; // 最后修改时间
    private Boolean deleted; // 是否删除
    private Long deleted_user; // 删除人编号
    private String deleted_user_name; // 删除人姓名
    private Date deleted_time; // 删除时间
    private String deleted_desc; // 删除备注
    private Long type_id;
    private Long client_id;
    private Double unit_price;
    private String type_name;
    private String user_agent;
    private String android_version;
    private String cpu_frequency;
    private String ram_space;
    private String screen_resolution;
    private String screen_size;
    private String market_price_section;
    private String start_settle_month="";
    private String end_settle_month="";

    public Long getCreate_user() {
        return create_user;
    }

    public void setCreate_user(Long create_user) {
        this.create_user = create_user;
    }

    public String getCreate_user_name() {
        return create_user_name;
    }

    public void setCreate_user_name(String create_user_name) {
        this.create_user_name = create_user_name;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Long getLast_modifier() {
        return last_modifier;
    }

    public void setLast_modifier(Long last_modifier) {
        this.last_modifier = last_modifier;
    }

    public String getLast_modifier_name() {
        return last_modifier_name;
    }

    public void setLast_modifier_name(String last_modifier_name) {
        this.last_modifier_name = last_modifier_name;
    }

    public Date getLast_modify() {
        return last_modify;
    }

    public void setLast_modify(Date last_modify) {
        this.last_modify = last_modify;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Long getDeleted_user() {
        return deleted_user;
    }

    public void setDeleted_user(Long deleted_user) {
        this.deleted_user = deleted_user;
    }

    public String getDeleted_user_name() {
        return deleted_user_name;
    }

    public void setDeleted_user_name(String deleted_user_name) {
        this.deleted_user_name = deleted_user_name;
    }

    public Date getDeleted_time() {
        return deleted_time;
    }

    public void setDeleted_time(Date deleted_time) {
        this.deleted_time = deleted_time;
    }

    public String getDeleted_desc() {
        return deleted_desc;
    }

    public void setDeleted_desc(String deleted_desc) {
        this.deleted_desc = deleted_desc;
    }

    public Long getType_id() {
        return type_id;
    }

    public void setType_id(Long type_id) {
        this.type_id = type_id;
    }

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public Double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(Double unit_price) {
        this.unit_price = unit_price;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public String getUser_agent() {
        return user_agent;
    }

    public void setUser_agent(String user_agent) {
        this.user_agent = user_agent;
    }

    public String getAndroid_version() {
        return android_version;
    }

    public void setAndroid_version(String android_version) {
        this.android_version = android_version;
    }

    public String getCpu_frequency() {
        return cpu_frequency;
    }

    public void setCpu_frequency(String cpu_frequency) {
        this.cpu_frequency = cpu_frequency;
    }

    public String getRam_space() {
        return ram_space;
    }

    public void setRam_space(String ram_space) {
        this.ram_space = ram_space;
    }

    public String getScreen_resolution() {
        return screen_resolution;
    }

    public void setScreen_resolution(String screen_resolution) {
        this.screen_resolution = screen_resolution;
    }

    public String getScreen_size() {
        return screen_size;
    }

    public void setScreen_size(String screen_size) {
        this.screen_size = screen_size;
    }

    public String getMarket_price_section() {
        return market_price_section;
    }

    public void setMarket_price_section(String market_price_section) {
        this.market_price_section = market_price_section;
    }

    public String getStart_settle_month() {
        return start_settle_month;
    }

    public void setStart_settle_month(String start_settle_month) {
        this.start_settle_month = start_settle_month;
    }

    public String getEnd_settle_month() {
        return end_settle_month;
    }

    public void setEnd_settle_month(String end_settle_month) {
        this.end_settle_month = end_settle_month;
    }
}
