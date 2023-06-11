package com.JdCollege.programmer.dao.my;

import com.JdCollege.programmer.dto.CategoryDTO;

import java.util.List;

/**
 * @author LuoHao
 * @QQ 1441432393
 * @WX 18375696578
 * @create 2023
 */
public interface MyCategoryMapper {

    // 根据销售价格获取前五商品分类
    List<CategoryDTO> getCategoryListByPrice();
}
