package com.shaojie.user.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.shaojie.user.service.UserService;
 
@Component
public class UserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	UserService userBo;
	
	public UserService getUserBo() {
		return userBo;
	}

	public void setUserBo(UserService userBo) {
		this.userBo = userBo;
	}

	public String execute() throws Exception {
		
		/*WebApplicationContext context =
			WebApplicationContextUtils.getRequiredWebApplicationContext(ServletActionContext.getServletContext());
		
		UserBo userBo1 = (UserBo)context.getBean("userBo");
		userBo1.printUser();*/
		
		userBo.printUser();
		
		return SUCCESS;
		
	}
}