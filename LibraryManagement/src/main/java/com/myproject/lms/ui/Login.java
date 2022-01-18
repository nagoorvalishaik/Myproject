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

import Filters.AvailableFilters;

public class Login {
	
	public void doUserLogin()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String username=sc.nextLine();
		
		System.out.println("Enter Password:");
		String password=sc.nextLine();
		
		UserCheck ucheck=new UserCheckImpl();

			boolean result;
			result=ucheck.checkLogin(username, password);
			
			if(result==true)
			{
				System.out.println("Login successfull...!!");
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
							service.deleteUser(userid);
							break;
					
					case 3:	System.out.println("Enter userId:");
							 int id=sc.nextInt();
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
							service.deleteBook(bookname);
							break;
				}
				
		}
	
		else {
			throw new InvalidCredentialsException("Invalid credentials..!!!") ;
		}
	
	
	
	}
	
}
