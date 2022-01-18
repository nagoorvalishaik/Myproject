package com.myproject.lms.service;

public interface UserService {
	
	public boolean searchBook(String bookname);
	public boolean getBook(int id,String bookname);
	public boolean returnBook(int userid);

}
