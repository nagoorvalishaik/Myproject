package Filters;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.myproject.lms.bean.User;
import com.myproject.lms.service.AdminFilterService;
import com.myproject.lms.service.AdminFilterServiceImpl;

public class UserFilters {

	List<User> list=new ArrayList<User>();
	public void displayFilters() 
	{
		AdminFilterService filters=new AdminFilterServiceImpl();
		UserFilters ufilt=new UserFilters();
		
		System.out.println();
		System.out.println("====USER FILTERS===");
		System.out.println("1.USER BY CATEGORY");
		System.out.println("2.USER BY ID");
		System.out.println("3.USER BY BRANCH");
		System.out.println("4.USER BY YEAR");
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		@SuppressWarnings({ "resource"})
		Scanner str=new Scanner(System.in);
	    
		System.out.println();
		System.out.println("Enter Choice :\n");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:	 System.out.println("Enter Category:");
					 String category=str.nextLine();
					 list=filters.byCategory(category);
					 if(list.size()>0) {
						 ufilt.printList(list);
					 }else {
						 System.out.println("No Users Available with this category..!!");
					 } break;
					
			case 2:  System.out.println("Enter userid:");
					 int id=sc.nextInt();
					 User u=new User();
					 u=filters.byId(id);
					 if(u!=null) {
						 ufilt.printUser(u);
					 }else {
						 System.out.println("User Does not exists..!!");
					 } break;
			
			case 3:	  	System.out.println("Enter Branch:");
						 String branch=str.nextLine();
						 list=filters.byBranch(branch);
						 if(list.size()>0) {
							 ufilt.printList(list);
						 }else {
							 System.out.println("No Users Available of this branch..!!");
						 } break;
						 
			case 4:		System.out.println("Enter Year:");
						 int year=sc.nextInt();
						 list=filters.byYear(year);
						 if(list.size()>0) {
							 ufilt.printList(list);
						 }else {
							 System.out.println("User Does not exists..!!");
						 } break;
						 
						 
			default:  return;
		}
	}
	
	
	public void printList(List<User> list)
	{
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%10s %20s %20s %30s %20s %20S", "USER_ID", "USER_NAME", "USER_DESIGNATION", "USER_GENDER","USER_BRANCH", "YEAR");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		for (User user : list) 
		{
			System.out.format("%10d %20s %20s %30s %20s %20s",user.getUserId(),user.getUserName(),user.getDesignation(),user.getGender(),user.getBranch(),user.getYear());
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	public void printUser(User user)
	{
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%10s %20s %20s %30s %20s %20S", "USER_ID", "USER_NAME", "USER_DESIGNATION", "USER_GENDER","USER_BRANCH", "YEAR");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		System.out.format("%10d %20s %20s %30s %20s %20s",user.getUserId(),user.getUserName(),user.getDesignation(),user.getGender(),user.getBranch(),user.getYear());
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
	}
}
