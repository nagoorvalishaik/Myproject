package com.myproject.lms.ui;
import java.util.Scanner;

import com.myproject.lms.bean.User;
import com.myproject.lms.service.AdminService;
import com.myproject.lms.service.AdminServiceImpl;

public class SignUp {

	AdminService ser=new AdminServiceImpl();

	public void doSignUp()
	{	
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner str=new Scanner(System.in);
		System.out.println();
		System.out.println("****User Details*****");
		System.out.println();
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
		
		User user=new User(id,name,gender,branch,design,year,pass);
		ser.addUser(user);
		
	}
}
