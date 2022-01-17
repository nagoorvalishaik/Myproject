package com.myproject.lms.dbo;
import  com.myproject.lms.bean.*;

public interface UserOperations {
	
	public boolean searchBook(String bookname);
	public Books getBook(String bookname);
	public void returnBook(int userid);
	public void payFine(int userid);
}
