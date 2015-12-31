package com.shaojie.user.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shaojie.user.service.UserService;

@Component
public class UserSpringAction{

	@Autowired
	UserService userBo;
	
	public UserService getUserBo() {
		return userBo;
	}

	public void setUserBo(UserService userBo) {
		this.userBo = userBo;
	}

	public String execute() throws Exception {
		
		System.out.println("execute() is executed...");

		userBo.printUser();
		
		return "success";
		
	}
}