package com.myproject.lms.ui;

import java.util.Scanner;

import com.myproject.lms.Exceptions.InvalidCredentialsException;
import com.myproject.lms.Exceptions.InvalidUserException;
import com.myproject.lms.Exceptions.InvalidUserNameException;
import com.myproject.lms.bean.Admin;
import com.myproject.lms.bean.Books;
import com.myproject.lms.dbo.UserCheck;
import com.myproject.lms.dbo.UserCheckImpl;
import com.myproject.lms.service.AdminService;
import com.myproject.lms.service.AdminServiceImpl;
import com.myproject.lms.service.UserService;
import com.myproject.lms.service.UserServiceImpl;

import Filters.AvailableFilters;

public class Login {
	
	public void doUserLogin()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner str=new Scanner(System.in);

		System.out.println("Enter Username:");
		String username=sc.nextLine();
		
		System.out.println("Enter Password:");
		String password=sc.nextLine();
		
		UserCheck ucheck=new UserCheckImpl();

			boolean result;
			result=ucheck.checkLogin(username, password);
			
			if(result)
			{
				UserService uservice=new UserServiceImpl();

				System.out.println("Login successfull...!!\n\n");
				System.out.println("*****User Services******\n");
				System.out.println("1.Serach Book");
				System.out.println("2.Get Book");
				System.out.println("3.Return Book\n\n");
				
				int option=sc.nextInt();
				
				switch(option) 
				{
					case 1: System.out.println("Enter BookName :");
					        String name=str.nextLine();
					        try
					        {
					        	uservice.searchBook(name);
					        }
					        catch(Exception e) 
					        {
					        	System.out.println("Book Not Available..!!!"+e);
					        }
					        break;
					        
					        
					        
					case 2:		System.out.println("Enter BookName :");
								String bookname=str.nextLine();
								System.out.println();
						        try
						        {
						        	boolean res=uservice.searchBook(bookname);
						        	if(res)
						        	{
						        		System.out.println();
						        		System.out.println("Enter Your Id to Confirm :");
						        		int id=sc.nextInt();
						        		uservice.getBook(id, bookname);
						        	}
						        }
						        catch(Exception e) 
						        {
						        	System.out.println(e);
						        }
						        break;
						        
						        
					case 3:  
							System.out.println("Enter Your Id:");
							int userid=sc.nextInt();
							try
							{
								uservice.returnBook(userid);
							}
							catch(Exception e)
							{
								System.out.println("Invalid User Id...!!!");
							}
							break;
				}
				
			}
			
			else
			{
				System.out.println("Invalid Credentials..!!");
			}
	}
	
	
	
	public void doAdminLogin() throws InvalidUserException, InvalidUserNameException, InvalidCredentialsException
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner str=new Scanner(System.in);
		System.out.println("Enter Username:");
		String username=str.nextLine();
		
		System.out.println("Enter Password:");
		String password=str.nextLine();
		
		Admin admin=new Admin();
			
		if(admin.getAdminName().equals(username) && admin.getAdminPassword().equals(password))
		{
				AdminService service=new AdminServiceImpl();
				System.out.println("*****Services******");
				System.out.println("1.Add User");
				System.out.println("2.Delete User");
				System.out.println("3.Get User");
				System.out.println("4.Add Books");
				System.out.println("5.Get Books");
				System.out.println("6.Delete Book");
				System.out.println();
				
				System.out.println("Enter Choice :");
				int choice=sc.nextInt();
				
				switch(choice) {
					
					case 1: SignUp sign=new SignUp();
							sign.doSignUp();
							break;
							
					case 2: System.out.println("Enter userId:");
					     	int userid=sc.nextInt();
							if(service.deleteUser(userid)==false)
								System.out.println("User Not Available...!!");
							break;
					
					case 3:	System.out.println("Enter userId:");
							 int id=sc.nextInt();
							 if(service.getUser(id)==null)
								 	System.out.println("User Not Available...!!");
							 else
								 System.out.println(service.getUser(id));
							 break;
							 
					case 4: System.out.println("Enter BookId:");
							int bid=sc.nextInt();
							System.out.println("Enter BookName:");
							String name=str.nextLine();
							System.out.println("Enter BookCategory:");
							String category=str.nextLine();
							System.out.println("Enter Authorname:");
							String author=str.nextLine();
							
							Books b=new Books(bid,name,category,author);
							service.addBook(b);
							break;
							
					case 5: 
							System.out.println();
							System.out.println("***Available Filters***\n");
							AvailableFilters filter=new AvailableFilters();
							filter.getFilters();
							break;	
							
					case 6: System.out.println("Enter bookName :");
							String bookname=str.nextLine();
							if(service.deleteBook(bookname)==false)
							{
								System.out.println("Book Not Available to delete...!!!");
							}
							break;
				}
				
		}
	
		else {
			throw new InvalidCredentialsException("Invalid credentials..!!!") ;
		}
	
	
	
	}
	
}
