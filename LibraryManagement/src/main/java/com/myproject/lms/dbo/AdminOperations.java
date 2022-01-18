package com.myproject.lms.dbo;
import com.myproject.lms.bean.Books;
import com.myproject.lms.bean.User;

public interface AdminOperations {
			
		public boolean addUser(User user);
		public boolean deleteUser(int userid);
		public User getUser(int userid);
		public boolean addBook(Books book);
		public Books getBook(String bookName);
		public boolean deleteBook(String bookname);
	

}