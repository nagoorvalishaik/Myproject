package com.myproject.lms.service;
import com.myproject.lms.bean.*;
import com.myproject.lms.dbo.BookFilterImpl;
import com.myproject.lms.dbo.BookFilters;
import java.util.List;

public class AdminFilterServiceImpl implements AdminFilterService{

	BookFilters filterOperations = new BookFilterImpl();
	
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
		
}
