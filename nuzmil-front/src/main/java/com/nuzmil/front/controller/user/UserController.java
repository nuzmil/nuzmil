package com.nuzmil.front.controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nuzmil.common.config.PropertyFactory;
import com.nuzmil.common.utils.DateUtil;

@Controller
public class UserController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private DateUtil dateUtil;
	
	@RequestMapping(value="/")
	public String createUser(HttpServletRequest request, HttpServletResponse response){
		logger.info("{}", "Front Controller");
		
		logger.info("{}", dateUtil.getNowDateTime());
		logger.info("{}", dateUtil.getNowDateTime("", ""));
		logger.info("{}", dateUtil.getNowDateTime(null, null));
		logger.info("{}", dateUtil.getNowDateTime(".", ":"));
		
		logger.info(">>>>>>>>{}", PropertyFactory.getProperty("default.date.delimiter"));
		
		return "main";
	}
	
}
