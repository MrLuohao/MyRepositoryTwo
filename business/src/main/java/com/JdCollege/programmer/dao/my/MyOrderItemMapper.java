package com.JdCollege.programmer.dao.my;

import com.JdCollege.programmer.domain.OrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author LuoHao
 * @QQ 1441432393
 * @WX 18375696578
 * @create 2023
 */
public interface MyOrderItemMapper {

    // 批量插入订单详情数据
    int batchInsert(@Param("orderItemList") List<OrderItem> orderItemList);

}
