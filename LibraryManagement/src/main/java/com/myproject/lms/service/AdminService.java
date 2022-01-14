package com.myproject.lms.service;
import java.util.List;
import com.myproject.lms.bean.Books;
import com.myproject.lms.bean.User;
import com.myproject.lms.Exceptions.*;

public interface AdminService {
		
	public boolean addUser(User user);
	public boolean deleteUser(int userid)throws UserDoesnotExistsException;
	public User getUser()throws UserDoesnotExistsException;
	public boolean addBook(Books book);
	
	
}