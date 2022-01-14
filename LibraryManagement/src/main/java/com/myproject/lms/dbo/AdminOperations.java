package com.myproject.lms.dbo;
import java.util.List;
import com.myproject.lms.bean.Books;
import com.myproject.lms.bean.User;
import com.myproject.lms.Exceptions.InvalidUserIdException;
import com.myproject.lms.Exceptions.UserDoesnotExistsException;

public interface AdminOperations {
			
		public boolean addUser(User user);
		public boolean deleteUser(int userid)throws UserDoesnotExistsException;
		public User getUser(int userid)throws UserDoesnotExistsException;
		public boolean addBook(Books book);
	

}