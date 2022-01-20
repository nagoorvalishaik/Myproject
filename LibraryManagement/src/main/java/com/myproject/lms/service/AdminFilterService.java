package com.myproject.lms.service;
import java.util.List;

import com.myproject.lms.bean.*;

public interface AdminFilterService {

	public List<Books>FilterByCategory(String category);
	public List<Books> FilterByAuthorName(String authorName);
	public Books FilterByBookName(String name);
	public List<Books> FilterByYear(int year);
	
}
