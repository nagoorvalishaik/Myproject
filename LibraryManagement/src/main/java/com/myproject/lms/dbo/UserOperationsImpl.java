package com.myproject.lms.dbo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.myproject.lms.bean.Books;
import com.myproject.lms.util.DatabaseConnection;

public class UserOperationsImpl implements UserOperations{

	Connection con=DatabaseConnection.con;
	PreparedStatement ps;
	
	public boolean searchBook(String bookname) 
	{
		String sqlQuery="select book_id from library.book where bookname=? ";
		
		try
		{
			ps=con.prepareStatement(sqlQuery);
			ps.setString(1, bookname);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				return true;
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Sorry..!!, Books Not AVailable");
		}
		return false;
	}

	public Books getBook(String bookname) {
		return null;
		// TODO Auto-generated method stub
		
	}

	public void returnBook(int userid) {
		// TODO Auto-generated method stub
		
	}

	public void payFine(int userid) {
		// TODO Auto-generated method stub
		
	}

}
