package com.wyait.manage.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyait.common.utils.DateUtil;
import com.wyait.manage.dao.RoleMapper;
import com.wyait.manage.dao.BusinessUsersMapper;
import com.wyait.manage.entity.UserRoleDTO;
import com.wyait.manage.entity.UserRolesVO;
import com.wyait.manage.entity.UserSearchDTO;
import com.wyait.manage.pojo.Role;
import com.wyait.manage.pojo.User;
import com.wyait.manage.pojo.UserRoleKey;
import com.wyait.manage.pojo.BusinessUsers;
import com.wyait.manage.service.BusinessService;
import com.wyait.manage.shiro.ShiroRealm;
import com.wyait.manage.utils.PageDataResult;
import com.wyait.manage.utils.SendMsgServer;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.mgt.RealmSecurityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * 商户处理service处理类
 * @author fjx
 * 2018年6月5日
 */
@Service
public class BusinessServiceImpl implements BusinessService {
	private static final Logger logger = LoggerFactory
			.getLogger(BusinessServiceImpl.class);
	
	
	@Autowired
	private BusinessUsersMapper BusinessUsersMapper;
	
	
	/**
	 * 分页查询商户列表
	 * @param page
	 * @param limit
	 * @return
	 */
	@Override
	public PageDataResult getBusinessUsers(UserSearchDTO userSearch, int page, int limit) {
		// 时间处理
		if (null != userSearch) {
			if (StringUtils.isNotEmpty(userSearch.getInsertTimeStart())
					&& StringUtils.isEmpty(userSearch.getInsertTimeEnd())) {
				userSearch.setInsertTimeEnd(DateUtil.format(new Date()));
			} else if (StringUtils.isEmpty(userSearch.getInsertTimeStart())
					&& StringUtils.isNotEmpty(userSearch.getInsertTimeEnd())) {
				userSearch.setInsertTimeStart(DateUtil.format(new Date()));
			}
			if (StringUtils.isNotEmpty(userSearch.getInsertTimeStart())
					&& StringUtils.isNotEmpty(userSearch.getInsertTimeEnd())) {
				if (userSearch.getInsertTimeEnd().compareTo(
						userSearch.getInsertTimeStart()) < 0) {
					String temp = userSearch.getInsertTimeStart();
					userSearch
							.setInsertTimeStart(userSearch.getInsertTimeEnd());
					userSearch.setInsertTimeEnd(temp);
				}
			}
		}
		PageDataResult pdr = new PageDataResult();
		PageHelper.startPage(page, limit);
		List<BusinessUsers> urList = BusinessUsersMapper.getBusinessUsers(userSearch);
		// 获取分页查询后的数据
		PageInfo<BusinessUsers> pageInfo = new PageInfo<>(urList);
		// 设置获取到的总记录数total：
		pdr.setTotals(Long.valueOf(pageInfo.getTotal()).intValue());
		pdr.setList(urList);
		return pdr;
	}

	/**
	 * 设置商户【新增或更新】
	 */
	@Override
	public String SaveBusinessUsers(BusinessUsers user) {
		if (user.getId() != null) {
			// 判断用户是否已经存在
			BusinessUsers exist = this.BusinessUsersMapper.findUserByName(user.getName());
			if (null != exist
					&& !String.valueOf(exist.getId()).equals(
							String.valueOf(user.getId()))) {
				return "该用户名已经存在";
			}
			BusinessUsers dataUser = this.BusinessUsersMapper.selectByPrimaryKey(user.getId());
			// 更新用户
			this.BusinessUsersMapper.updateByPrimaryKeySelective(user);
		} else {
			// 判断用户是否已经存在
			BusinessUsers exist = this.BusinessUsersMapper.findUserByName(user.getName());
			if (null != exist) {
				return "该用户名已经存在";
			}
			// 新增用户
			this.BusinessUsersMapper.insert(user);
		}
		return "ok";
	}


	/**
	 * 删除
	 */
	@Override
	public String setDelBusinessUsers(String id, Integer isDel) {
		return this.BusinessUsersMapper.setDelUser(id, isDel) == 1 ? "ok"
				: "删除失败，请您稍后再试";
	}


	@Override
	public UserRolesVO getBusinessUsersAndRoles(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public BusinessUsers findBusinessUsersByMobile(String mobile) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public BusinessUsers findBusinessUsersByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int updatePwd(Integer id, String password) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int setBusinessUsersLockNum(Integer id, int isLock) {
		// TODO Auto-generated method stub
		return 0;
	}


}
