package com.shaojie.user.service;

import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{

	public void printUser(){
		System.out.println("printUser() is executed...");
	}
	
}