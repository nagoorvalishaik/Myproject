package com.myproject.lms.ui;

import java.util.Scanner;

import com.myproject.lms.dbo.UserCheck;
import com.myproject.lms.dbo.UserCheckImpl;
import com.myproject.lms.dbo.UserOperations;
import com.myproject.lms.dbo.UserOperationsImpl;

public class Login {
	
	public boolean doLogin()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String username=sc.nextLine();
		
		System.out.println("Enter Password:");
		String password=sc.nextLine();
		
		
		try 
		{
			UserCheck ucheck=new UserCheckImpl();

			ucheck.checkLogin(username, password);
			
			
		}
		catch(Exception e)
		{
			System.out.println("User Doesnot Exist.....>>idiot");
		}
			
		return false;
	}
}
