package com.myproject.lms.ui;

import java.util.Scanner;

public class LibraryPortal {

	
	public static void main(String[] args)
	{
		System.out.println("======================================");
		System.out.println("1.Login");
		System.out.println("2.Register user\n\n");
		System.out.println("Enter choice:");
		
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:	Login log=new Login();
					log.doLogin();
					break;
				
			case 2:
					SignUp signup=new SignUp();
					signup.doSignUp();
					break;
		}
	}
}
