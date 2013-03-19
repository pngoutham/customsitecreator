/**
 * 
 */
package com.csc.core.login.service;

import com.csc.core.framework.hibernate.properties.Login;

/**
 * @author goutham
 *
 */
public interface LoginService {
	boolean isLoginSuccessful(Login login);
}
