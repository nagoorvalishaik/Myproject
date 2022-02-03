package com.myproject.lms.dbo;

public interface UserOperations {
	
	public boolean searchBook(String bookname);
	public boolean requestBook(int userid,String bookname);
	public boolean returnBook(int userid);
}
