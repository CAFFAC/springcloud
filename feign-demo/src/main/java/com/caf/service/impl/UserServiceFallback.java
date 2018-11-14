package com.caf.service.impl;



import com.caf.model.User;
import com.caf.service.UserFeignService;

import org.springframework.stereotype.Component;

@Component
public class UserServiceFallback implements UserFeignService {
	@Override
	public String addUser(User user) {
		return null;
	}

	@Override
	public String updateUser(User user) {
		return null;
	}

	/**
	  * 出错则调用该方法返回友好错误
	  * @param username
	  * @return
	  */
	public String getUser(String username){
		return "The user does not exist in this system, please confirm username";
	}
}
