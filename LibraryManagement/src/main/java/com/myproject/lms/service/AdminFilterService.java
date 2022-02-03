package com.myproject.lms.service;
import java.util.List;

import com.myproject.lms.bean.*;

public interface AdminFilterService {

	public List<Books>FilterByCategory(String category);
	public List<Books> FilterByAuthorName(String authorName);
	public Books FilterByBookName(String name);
	public List<Books> FilterByYear(int year);
	
	
	public List<User>byCategory(String category);
	public List<User>byBranch(String branch);
	public User byId(int id);
	public List<User>byYear(int year);	
}
