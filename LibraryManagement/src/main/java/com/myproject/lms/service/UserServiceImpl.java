package com.myproject.lms.service;

import com.myproject.lms.dbo.RecordCheck;
import com.myproject.lms.dbo.RecordCheckImpl;
import com.myproject.lms.dbo.UserOperations;
import com.myproject.lms.dbo.UserOperationsImpl;

public class UserServiceImpl implements UserService{

	UserOperations operations=new UserOperationsImpl();
	RecordCheck recordCheck=new RecordCheckImpl();
	
	public boolean searchBook(String bookname) 
	{
		if(bookname!=null) 
		{
			return operations.searchBook(bookname);
		}
		return false;
	}

	public boolean requestBook(int id,String bookname) 
	{
			
		if(id>0) 
		{
			if(recordCheck.checkRecord(id)==false) 
			{
				System.out.println("Unable to issue book as you have not returned previous book..!!");
				return false;
			}
					
				return operations.requestBook(id,bookname);
			
		}
		return false;
		
		
	}

	public boolean returnBook(int userid) 
	{
		if(userid>0)
		{			
			if(recordCheck.checkRecord(userid)==false) 
			{
				System.out.println("No Due for you..!!");
			}
			return operations.returnBook(userid);
		}
		return false;
	}

}
