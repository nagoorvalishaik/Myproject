package com.myproject.lms.operations;
import java.util.List;
import com.myproject.lms.bean.Books;
import com.myproject.lms.Exceptions.InvalidUserIdException;
import com.myproject.lms.Exceptions.UserAlreadyExistsException;

public interface AdminOperations {
		
	public boolean addUser(Object o)throws UserAlreadyExistsException;
	public boolean removeUser(int userid)throws InvalidUserIdException;
	public boolean addBook(Books book);
	public List<Object> getAllUsers();
	public Object getUSerDetailsById(int userid);

}