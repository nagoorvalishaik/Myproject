package com.myproject.lms.ui;
import java.util.Scanner;

import com.myproject.lms.bean.User;
import com.myproject.lms.dbo.AdminOperationImpl;
import com.myproject.lms.dbo.AdminOperations;

public class SignUp {

	Scanner sc=new Scanner(System.in);
	Scanner str=new Scanner(System.in);
	
	public void doSignUp()
	{
		System.out.println("Enter Userid:");
		int id=sc.nextInt();
		
		System.out.println("Enter Username:");
		String name=str.nextLine();
		
		System.out.println("Enter gender:");
		String gender=str.nextLine();
		
		System.out.println("Enter branch:");
		String branch=str.nextLine();
		
		System.out.println("Enter designation:");
		String design=str.nextLine();
		
		System.out.println("Enter year:");
		int year=sc.nextInt();
		
		System.out.println("Enter password:");
		String pass=str.nextLine();
		
		User u=new User(id,name,gender,branch,design,year,pass);
		
		
		AdminOperations adop=new AdminOperationImpl();
		adop.addUser(u);
	}
}
