package com.nuzmil.admin.controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nuzmil.common.service.user.UserService;

@Controller
public class UserController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/")
	public String createUser(HttpServletRequest request, HttpServletResponse response){
		logger.info("{}", "Admin Controller");
		try {
			userService.createUser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		return "main";
	}
	
}
