package com.nuzmil.common.service.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nuzmil.common.dao.user.UserDAO;
import com.nuzmil.common.service.user.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserDAO userDAO;

	@Override
	public void createUser() throws Exception {
		for(int i=0; i<10; i++){
			logger.info("{}", i);
			if(i == 5){
				throw new Exception();
			}
			userDAO.createUser(String.valueOf(i));
		}
	}

}
