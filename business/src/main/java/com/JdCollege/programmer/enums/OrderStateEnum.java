package com.JdCollege.programmer.enums;

/**
 * @author LuoHao
 * @QQ 1441432393
 * @WX 18375696578
 * @create 2023
 */
/**
 * 订单状态枚举类：1：已支付，待发货；2：已发货，待收货；3：已收货；4：已取消
 * @author 82320
 *
 */
public enum OrderStateEnum {

    PAYED(1,"已支付，待发货"),

    SEND(2, "已发货，待收货"),

    SIGN(3, "已收货"),

    CANCELED(4,"已取消"),

            ;

    Integer code;

    String desc;

    OrderStateEnum(Integer code, String desc) {
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
