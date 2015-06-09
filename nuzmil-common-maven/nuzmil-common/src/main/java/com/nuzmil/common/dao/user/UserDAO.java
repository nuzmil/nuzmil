package com.nuzmil.common.dao.user;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO extends SqlSessionDaoSupport {
	
	private static final String NAME_SPACE = "test.";

	public void createUser(String parameter){
		getSqlSession().insert(NAME_SPACE+"createText", parameter);
	}
	
}
