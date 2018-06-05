package com.wyait.manage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wyait.manage.entity.UserSearchDTO;
import com.wyait.manage.pojo.BusinessUsers;
import com.wyait.manage.pojo.User;

@Mapper
public interface BusinessUsersMapper  {
	
	int insert(BusinessUsers record);
	BusinessUsers selectByPrimaryKey(String id);
	int updateByPrimaryKeySelective(BusinessUsers record);
	/**
	 * 分页查询用户数据
	 * @return
	 */
	List<BusinessUsers> getBusinessUsers(@Param("userSearch") UserSearchDTO userSearch);
	
	/**
	 * 删除用户
	 * @param id
	 * @param isDel
	 * @return
	 */
	int setDelUser(@Param("id") String id, @Param("isDel") Integer isDel);
	
	/**
	 * 根据用户名获取用户数据
	 * @param name
	 * @return
	 */
	BusinessUsers findUserByName(String name);
}