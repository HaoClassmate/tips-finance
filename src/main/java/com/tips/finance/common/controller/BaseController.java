package com.tips.finance.common.controller;

import org.springframework.stereotype.Controller;
import com.tips.finance.common.utils.ShiroUtils;
import com.tips.finance.system.domain.UserDO;

@Controller
public class BaseController {
	public UserDO getUser() {
		return ShiroUtils.getUser();
	}

	public Long getUserId() {
		return getUser().getUserId();
	}

	public String getUsername() {
		return getUser().getUsername();
	}
}