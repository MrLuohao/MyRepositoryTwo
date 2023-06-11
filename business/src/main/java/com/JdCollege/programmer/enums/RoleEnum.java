package com.JdCollege.programmer.enums;

/**
 * @author LuoHao
 * @QQ 1441432393
 * @WX 18375696578
 * @create 2023
 */

/**
 * 用户所属角色枚举类
 */
public enum RoleEnum {

    USER("IvADLevN","普通用户"),

    ADMIN("SwjNNKK7","管理员"),

    ;

    String code;

    String desc;

    RoleEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
