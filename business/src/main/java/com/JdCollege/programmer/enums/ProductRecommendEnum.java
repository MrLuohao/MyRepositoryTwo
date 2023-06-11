package com.JdCollege.programmer.enums;

/**
 * @author LuoHao
 * @QQ 1441432393
 * @WX 18375696578
 * @create 2023
 */
public enum ProductRecommendEnum {

    NO(0,"不推荐"),

    YES(1,"推荐"),

    ;

    Integer code;

    String desc;

    ProductRecommendEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
