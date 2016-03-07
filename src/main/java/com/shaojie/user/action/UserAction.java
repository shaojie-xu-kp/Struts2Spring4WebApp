package com.shaojie.user.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.shaojie.user.model.User;
import com.shaojie.user.service.UserService;
 
@Component
public class UserAction extends ActionSupport implements ModelDriven<User>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	UserService userBo;
	
	private User user = new User();
	
	private List<String> listOfUsers=new ArrayList<String>();  
	
	public UserService getUserBo() {
		return userBo;
	}

	public void setUserBo(UserService userBo) {
		this.userBo = userBo;
	}

	public String execute() throws Exception {
		
		populateUsers();
		
		user.setName("Shaojie");
		
		userBo.printUser();
		
		return SUCCESS;
		
	}

	private void populateUsers() {
		this.listOfUsers.add("Shaojie");
		this.listOfUsers.add("shaojie");
		this.listOfUsers.add("xu");
		this.listOfUsers.add("junyi");
		this.listOfUsers.add("yikai");
		this.listOfUsers.add("xiao xu");
		this.listOfUsers.add("xu yi kai");
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public User getModel() {
		return user;
	}
	
	
	
}