package com.myproject.lms.service;
import java.util.List;

import com.myproject.lms.bean.Books;
import com.myproject.lms.bean.User;

public interface AdminService {
		
	public boolean addUser(User user);
	public boolean deleteUser(int userid);
	public User getUser(int userid);
	public boolean addBook(Books book);
	public boolean deleteBook(String name);
	public Books getBook(String name);
	public List<User> issuedRecords();

}