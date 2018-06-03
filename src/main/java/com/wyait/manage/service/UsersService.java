package com.wyait.manage.service;

import com.wyait.manage.entity.UserSearchDTO;
import com.wyait.manage.utils.PageDataResult;

/**
 * ion：V1.0
 */
public interface UsersService {
	/**
	 * 分页查询用户列表
	 * @param page
	 * @param limit
	 * @return
	 */
	PageDataResult getUsers(UserSearchDTO userSearch, int page, int limit);


}
