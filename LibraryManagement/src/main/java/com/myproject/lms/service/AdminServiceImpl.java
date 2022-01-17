package com.myproject.lms.service;
import com.myproject.lms.Exceptions.InvalidUserException;
import com.myproject.lms.bean.Books;
import com.myproject.lms.bean.User;
import com.myproject.lms.dbo.AdminOperationImpl;
import com.myproject.lms.dbo.AdminOperations;

public class AdminServiceImpl implements AdminService{

	AdminOperations ad=new AdminOperationImpl();

		public boolean addUser(User user)
		{
			try {
					
					ad.addUser(user);
				}
				catch(Exception e) {
					System.out.println("Interuption while adding user"+e);
				}
			return false;		
		}

			public boolean deleteUser(int userid)
			{
				try 
				{
					ad.deleteUser(userid);
				}
				catch(Exception e)
				{
						
					System.out.println("Unable to delete..!!"+e);
				}
					return false;
			}

		public User getUser(int id)throws InvalidUserException
		{
		
			User user=ad.getUser(id);
			if(user == null)
			{
				throw new InvalidUserException();
			}
			return user;
			
		}

		public boolean addBook(Books book) {
			
			try 
			{
				return ad.addBook(book);
			}
			catch(Exception e) 
			{
				System.out.println("Interuption while adding book"+e);
			}
			return false;
		}

		

		
	
}
