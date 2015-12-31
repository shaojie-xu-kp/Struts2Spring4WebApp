package com.shaojie.user.service;

import org.springframework.stereotype.Service;


@Service
public class TutorialService {

	public String findTutorial(String language) {
		
		if(language == null) return "no input";
		
		switch (language.toUpperCase()) {
		case "JAVA":
			return "java";
		case "RUBY":
			return "ruby";
		default:
			return "java";
		}
	}

}
