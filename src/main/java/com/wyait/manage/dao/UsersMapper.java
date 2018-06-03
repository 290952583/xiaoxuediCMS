package com.wyait.manage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wyait.manage.entity.UserSearchDTO;
import com.wyait.manage.entity.UsersRoleDTO;

@Mapper
public interface UsersMapper{
	
	 /* 分页查询用户数据
	 * @return
	 */
	List<UsersRoleDTO> getUsers(@Param("userSearch") UserSearchDTO userSearch);
}