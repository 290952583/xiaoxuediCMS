package com.wyait.manage.web.business;


import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wyait.manage.entity.UserSearchDTO;
import com.wyait.manage.pojo.BusinessUsers;
import com.wyait.manage.pojo.User;
import com.wyait.manage.service.BusinessService;
import com.wyait.manage.utils.PageDataResult;


@Controller
@RequestMapping("/business")
public class BusinessController {

	@Autowired
	private BusinessService businessService;
	
	private static final Logger logger = LoggerFactory
			.getLogger(BusinessController.class);
	
	/**
	 * 获取商家列表
	 * @return
	 */
    @RequestMapping("/businessList")
    public String toBusinessList() {
        return "/business/businessList";
    }
    
    
	/**
	 * 分页查询商户列表
	 * @return ok/fail
	 */
	@RequestMapping(value = "/getBusinessList", method = RequestMethod.GET)
	@ResponseBody
	@RequiresPermissions(value = "usermanage")
	public PageDataResult getBusinessList(@RequestParam("page") Integer page,
			@RequestParam("limit") Integer limit, UserSearchDTO userSearch) {
		logger.debug("分页查询商户列表！搜索条件：userSearch：" + userSearch + ",page:" + page
				+ ",每页记录数量limit:" + limit);
		PageDataResult pdr = new PageDataResult();
		try {
			if (null == page) {
				page = 1;
			}
			if (null == limit) {
				limit = 10;
			}
			// 获取商户和角色列表
			pdr = businessService.getBusinessUsers(userSearch, page, limit);
			logger.debug("商户列表查询=pdr:" + pdr);

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("商户列表查询异常！", e);
		}
		return pdr;
	}
	
	/**
	 * 设置商户[新增或更新]
	 * @return ok/fail
	 */
	@RequestMapping(value = "/setUser", method = RequestMethod.POST)
	@ResponseBody
	public String setUser( BusinessUsers user) {
		logger.debug("设置商户[新增或更新]！user:" + user );
		try {
			if (null == user) {
				logger.debug("置商户[新增或更新]，结果=请您填写商户信息");
				return "请您填写商户信息";
			}
			User existUser = (User) SecurityUtils.getSubject().getPrincipal();
			if (null == existUser) {
				logger.debug("删除商户，结果=您未登录或登录超时，请您登录后再试");
				return "您未登录或登录超时，请您登录后再试";
			}
			return businessService.SaveBusinessUsers(user);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("设置商户[新增或更新]异常！", e);
			return "操作异常，请您稍后再试";
		}
	}

	/**
	 * 删除商户
	 * @return ok/fail
	 */
	@RequestMapping(value = "/delUser", method = RequestMethod.POST)
	@ResponseBody
	public String delUser(@RequestParam("id") String id) {
		logger.debug("删除商户！id:" + id );
		String msg = "";
		try {
			if (null == id ) {
				logger.debug("删除商户，结果=请求参数有误，请您稍后再试");
				return "请求参数有误，请您稍后再试";
			}
			User existUser = (User) SecurityUtils.getSubject().getPrincipal();
			if (null == existUser) {
				logger.debug("删除商户，结果=您未登录或登录超时，请您登录后再试");
				return "您未登录或登录超时，请您登录后再试";
			}
			// 删除商户
			msg = businessService.setDelBusinessUsers(id, 1);
			logger.info("删除商户:" + msg + "！userId=" + id + "，操作用户id:"
					+ existUser.getId() );
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("删除商户异常！", e);
			msg = "操作异常，请您稍后再试";
		}
		return msg;
	}
}
