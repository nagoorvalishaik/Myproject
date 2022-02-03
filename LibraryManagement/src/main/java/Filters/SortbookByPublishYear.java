package Filters;

import java.util.Collections;
import java.util.List;

import com.myproject.lms.bean.*;
import com.myproject.lms.dbo.BookFilterImpl;
import com.myproject.lms.dbo.BookFilters;


import Sortings.SortbyYear;

public class SortbookByPublishYear {

	BookFilters bfs=new BookFilterImpl();
	
	public List<Books> sortByYear(int year)
	{
	
		
		List<Books> bookList=bfs.FilterByYear(year);
		
		Collections.sort(bookList,new SortbyYear());
		
		return bookList;
		
	}
}
