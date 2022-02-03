package com.myproject.lms.service;

public interface UserService {
	
	public boolean searchBook(String bookname);
	public boolean requestBook(int id,String bookname);
	public boolean returnBook(int userid);

}
