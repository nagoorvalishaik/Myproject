package com.myproject.lms.dbo;

import com.myproject.lms.Exceptions.InvalidCredentialsException;

public interface UserCheck {
	
	public int checkLogin(String username,String password)throws InvalidCredentialsException;
	
}
