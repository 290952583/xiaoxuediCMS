package com.wyait.manage.service;

import com.wyait.manage.entity.UserRolesVO;
import com.wyait.manage.entity.UserSearchDTO;
import com.wyait.manage.pojo.BusinessUsers;
import com.wyait.manage.utils.PageDataResult;

/**
 * 
 * @author fjx
 * 2018年6月5日
 */
public interface BusinessService {
	/**
	 * 分页查询商户列表
	 * @param page
	 * @param limit
	 * @return
	 */
	PageDataResult getBusinessUsers(UserSearchDTO BusinessUsersearch, int page, int limit);

	/**
	 *	设置商户【新增或更新】
	 * @param BusinessUsers
	 * @param roleIds
	 * @return
	 */
	String SaveBusinessUsers(BusinessUsers BusinessUsers);


	/**
	 * 删除商户
	 * @param id
	 * @param isDel
	 * @return
	 */
	String setDelBusinessUsers(String id, Integer isDel);

	/**
	 * 查询商户数据
	 * @param id
	 * @return
	 */
	UserRolesVO getBusinessUsersAndRoles(Integer id);


	/**
	 * 根据手机号查询商户数据
	 * @param mobile
	 * @return
	 */
	BusinessUsers findBusinessUsersByMobile(String mobile);
	/**
	 * 根据商户名查询商户数据
	 * @param mobile
	 * @return
	 */
	BusinessUsers findBusinessUsersByName(String name);


	/**
	 * 修改商户密码
	 * @param id
	 * @param password
	 * @return
	 */
	int updatePwd(Integer id, String password);

	/**
	 * 锁定商户
	 * @param id
	 * @param isLock  0:解锁；1：锁定
	 * @return
	 */
	int setBusinessUsersLockNum(Integer id, int isLock);
}
