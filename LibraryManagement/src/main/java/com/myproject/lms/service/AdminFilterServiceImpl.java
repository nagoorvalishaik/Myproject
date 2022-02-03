package com.myproject.lms.service;
import com.myproject.lms.bean.*;
import com.myproject.lms.dbo.BookFilterImpl;
import com.myproject.lms.dbo.BookFilters;
import com.myproject.lms.dbo.UserFilter;
import com.myproject.lms.dbo.UserFilterImpl;

import java.util.List;

public class AdminFilterServiceImpl implements AdminFilterService{

	BookFilters filterOperations = new BookFilterImpl();
	UserFilter userFilters=new UserFilterImpl();
	
	public List<Books> FilterByCategory(String category) 
	{	
		if(category!=null)
		{
			return filterOperations.FilterByCategory(category);
		}
		return null;
	}

	public List<Books> FilterByAuthorName(String authorName)
	{
		if(authorName!=null)
		{
			return filterOperations.FilterByAuthorName(authorName);
		}
		return null;
	}

	
	public Books FilterByBookName(String name) 
	{
		if(name!=null) 
		{
			return filterOperations.FilterByBookName(name);
		}
		return null;

	}

	public List<Books> FilterByYear(int year) {
		
		if(year!=0) 
		{
			return filterOperations.FilterByYear(year);
		}
		return null;
	}

	public List<User> byCategory(String category) 
	{
		if(category!=null) {
			return  userFilters.byCategory(category);
		}
		return null;
	}

	

	

	public List<User> byYear(int year) 
	{		
		if(year!=0) {
			return userFilters.byYear(year);
		}
		return null;
	}

	public List<User> byBranch(String branch) 
	{
		if(branch!=null) {
			return userFilters.byBranch(branch);
		}
		return null;
	}

	public User byId(int id) {
		
		if(id>0) {
			return userFilters.byId(id);
		}
		return null;
	}
		
}
