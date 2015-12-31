package com.shaojie.user.action;

import org.springframework.stereotype.Component;

import com.shaojie.user.service.TutorialService;


@Component
public class TutorialAction {
	
	private String actionValue;
	
	private String language;
	
	public String execute(){
		
		TutorialService tutorialService = new TutorialService();
		
		this.setActionValue("action_value");
		System.out.println("TutorialAction executed.");
		language = tutorialService.findTutorial(language);
		System.out.println("Language is : " + language);
		return "success";
	}

	public String getActionValue() {
		return actionValue;
	}

	public void setActionValue(String actionValue) {
		this.actionValue = actionValue;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	

}
