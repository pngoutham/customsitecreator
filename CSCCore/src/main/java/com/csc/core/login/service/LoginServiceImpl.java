package com.csc.core.login.service;

import com.csc.core.framework.hibernate.properties.Login;
import com.csc.core.login.dao.LoginDao;

public class LoginServiceImpl implements LoginService {

	private LoginDao loginDao;
	@Override
	public boolean isLoginSuccessful(Login login) {
		// TODO Auto-generated method stub
		return loginDao.isLoginSuccessful(login);
	}

}
