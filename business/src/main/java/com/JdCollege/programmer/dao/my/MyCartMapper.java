package com.JdCollege.programmer.dao.my;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author LuoHao
 * @QQ 1441432393
 * @WX 18375696578
 * @create 2023
 */
public interface MyCartMapper {

    // 批量删除购物车数据
    int batchDelete(@Param("idList") List<String> idList);
}
