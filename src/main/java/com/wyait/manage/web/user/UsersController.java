package com.wyait.manage.web.user;

import com.wyait.manage.entity.ResponseResult;
import com.wyait.manage.entity.UserSearchDTO;
import com.wyait.manage.service.UsersService;
import com.wyait.manage.utils.IStatusMessage;
import com.wyait.manage.utils.PageDataResult;
import net.sf.oval.ConstraintViolation;
import net.sf.oval.Validator;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @项目名称：wyait-manage
 * @包名：com.wyait.manage.web.user
 * @类描述：
 * @创建人：wyait
 * @创建时间：2017-12-31 14:22
 * @version：V1.0
 */
@Controller
@RequestMapping("/general")
public class UsersController {

	private static final Logger logger = LoggerFactory
			.getLogger(UsersController.class);
	@Autowired
	private UsersService usersService;

	//private static final Pattern MOBILE_PATTERN = Pattern.compile("^1\\d{10}$");

	@RequestMapping("/usersList")
	public String toUserList() {
		return "/users/usersList";
	}

	/**
	 * 分页查询用户列表
	 * @return ok/fail
	 */
	@RequestMapping(value = "/getUsers", method = RequestMethod.GET)
	@ResponseBody
	@RequiresPermissions(value = "usermanage")
	public PageDataResult getUsers(@RequestParam("page") Integer page,
			@RequestParam("limit") Integer limit, UserSearchDTO userSearch) {
		logger.debug("分页查询用户列表！搜索条件：userSearch：" + userSearch + ",page:" + page
				+ ",每页记录数量limit:" + limit);
		PageDataResult pdr = new PageDataResult();
		try {
			if (null == page) {
				page = 1;
			}
			if (null == limit) {
				limit = 10;
			}
			// 获取用户和角色列表
			pdr = usersService.getUsers(userSearch, page, limit);
			logger.debug("用户列表查询=pdr:" + pdr);

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("用户列表查询异常！", e);
		}
		return pdr;
	}


	/**
	 * @描述：校验请求参数
	 * @param obj
	 * @param response
	 * @return
	 */
	protected boolean validatorRequestParam(Object obj, ResponseResult response) {
		boolean flag = false;
		Validator validator = new Validator();
		List<ConstraintViolation> ret = validator.validate(obj);
		if (ret.size() > 0) {
			// 校验参数有误
			response.setCode(IStatusMessage.SystemStatus.PARAM_ERROR.getCode());
			response.setMessage(ret.get(0).getMessageTemplate());
		} else {
			flag = true;
		}
		return flag;
	}
}
