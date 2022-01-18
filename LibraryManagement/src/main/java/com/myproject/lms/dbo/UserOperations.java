package com.myproject.lms.dbo;

public interface UserOperations {
	
	public boolean searchBook(String bookname);
	public boolean getBook(int userid,String bookname);
	public boolean returnBook(int userid);
}
