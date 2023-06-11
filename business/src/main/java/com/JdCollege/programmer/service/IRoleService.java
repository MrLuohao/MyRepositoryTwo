package com.JdCollege.programmer.service;

import com.JdCollege.programmer.dto.PageDTO;
import com.JdCollege.programmer.dto.ResponseDTO;
import com.JdCollege.programmer.dto.RoleDTO;

import java.util.List;

/**
 * @author LuoHao
 * @QQ 1441432393
 * @WX 18375696578
 * @create 2023
 */
public interface IRoleService {

    // 分页获取角色数据
    ResponseDTO<PageDTO<RoleDTO>> getRoleListByPage(PageDTO<RoleDTO> pageDTO);

    // 保存角色数据(添加、修改)
    ResponseDTO<Boolean> saveRole(RoleDTO roleDTO);

    // 删除角色数据
    ResponseDTO<Boolean> removeRole(RoleDTO roleDTO);

    // 获取所有角色数据
    ResponseDTO<List<RoleDTO>> getAllRoleList();
}
