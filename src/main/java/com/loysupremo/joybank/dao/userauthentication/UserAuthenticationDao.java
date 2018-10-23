package com.loysupremo.joybank.dao.userauthentication;
///User table interface object
import javax.sql.DataSource;

import com.loysupremo.joybank.model.Request;
import com.loysupremo.joybank.model.UserAuthentication;

public interface UserAuthenticationDao {
	
	public void setDataSource(DataSource dataSource);
	
	public Boolean save(UserAuthentication userdetails);
	
	public String changePassword(String oldPassword,String newPassword,String confirmPassword,Integer userID,String role);
	
	public UserAuthentication getUserDetails(String email);
}
