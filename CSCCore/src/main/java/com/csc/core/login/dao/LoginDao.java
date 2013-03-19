package com.csc.core.login.dao;

import com.csc.core.framework.hibernate.properties.Login;

public interface LoginDao {
	boolean isLoginSuccessful(Login login);
}
