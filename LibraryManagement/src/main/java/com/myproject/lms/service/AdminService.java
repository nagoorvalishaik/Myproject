package com.myproject.lms.service;
import com.myproject.lms.Exceptions.InvalidUserException;
import com.myproject.lms.bean.Books;
import com.myproject.lms.bean.User;

public interface AdminService {
		
	public boolean addUser(User user);
	public boolean deleteUser(int userid);
	public User getUser(int userid) throws InvalidUserException;
	public boolean addBook(Books book);
	public boolean deleteBook(String name);
	
}