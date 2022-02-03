package com.myproject.lms.ui;

import java.util.Scanner;

import com.myproject.lms.Exceptions.InvalidCredentialsException;
import com.myproject.lms.Exceptions.InvalidUserException;
import com.myproject.lms.Exceptions.InvalidUserNameException;

public class LibraryPortal {

	
	public static void main(String[] args) throws InvalidUserException, InvalidUserNameException
	{
		System.out.println("======Library Management System========");
		System.out.println();
		System.out.println("=============");
		System.out.println("LOGIN PORTAL");
		System.out.println("=============");

		System.out.println("1.USER LOGIN");
		System.out.println("2.REGISTER USER");
		System.out.println("3.ADMIN LOGIN");
		System.out.println("0.EXIT ");
		System.out.println();
		System.out.println("Enter choice:");
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:	Login log=new Login();
					log.doUserLogin();
					break;
				
			case 2:
					SignUp signup=new SignUp();
					signup.doSignUp();
					break;
					
			case 3:
					Login admin=new Login();
			try 
			{
				admin.doAdminLogin();
			} 
			catch(InvalidCredentialsException e)
			{
				
				System.out.println(e);
			}
					break;
					
			case 4: System.out.println("Logged Out From the portal...!!");
					System.exit(0);
				
		}
	}
}
