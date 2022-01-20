package com.myproject.lms.service;
import com.myproject.lms.bean.Books;
import com.myproject.lms.bean.User;
import com.myproject.lms.dbo.AdminOperationImpl;
import com.myproject.lms.dbo.AdminOperations;

public class AdminServiceImpl implements AdminService{

	AdminOperations ad=new AdminOperationImpl();

		public boolean addUser(User user)
		{
			try {
					
					return ad.addUser(user);
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
					return ad.deleteUser(userid);
				}
				catch(Exception e)
				{
						
					System.out.println("Unable to delete..!!"+e);
				}
					return false;
			}

		public User getUser(int id)
		{
		
			try 
			{
				return ad.getUser(id);
			}
			catch(Exception e) 
			{
				System.out.println("User not Available"+e);
			}
			return null;
			
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

		public boolean deleteBook(String name) 
		{
			
			try
			{
				return ad.deleteBook(name);
			}
			catch(Exception e) 
			{
				System.out.println("Interuption while deleting..!!");
			}
			return false;
		}
		
		public Books getBook(String name)
		{
			try
			{
				return ad.getBook(name);
			}
			catch(Exception e)
			{
				System.out.println("Book not available....!!!");
			}
			return null;
			
		}

		

		
	
}
