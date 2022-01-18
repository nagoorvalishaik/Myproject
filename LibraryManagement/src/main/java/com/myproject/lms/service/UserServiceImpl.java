package com.myproject.lms.service;

import com.myproject.lms.dbo.UserOperations;
import com.myproject.lms.dbo.UserOperationsImpl;

public class UserServiceImpl implements UserService{

	UserOperations operations=new UserOperationsImpl();
	
	public boolean searchBook(String bookname) 
	{
		if(bookname!=null) 
		{
			return operations.searchBook(bookname);
		}
		return false;
	}

	public boolean getBook(int id,String bookname) 
	{
		
		if(bookname!=null) 
		{
			if(id>0) {
				return operations.getBook(id,bookname);
			}
		}
		return false;
		
	}

	public boolean returnBook(int userid) 
	{
		if(userid>0)
		{
			return operations.returnBook(userid);
		}
		return false;
	}

}
