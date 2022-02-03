package com.myproject.lms.dbo;
import com.myproject.lms.bean.*;
import java.util.List;

public interface BookFilters{
	
	public List<Books>FilterByCategory(String category);
	public List<Books> FilterByAuthorName(String authorName);
	public Books FilterByBookName(String name);
	public List<Books> FilterByYear(int year);

}
