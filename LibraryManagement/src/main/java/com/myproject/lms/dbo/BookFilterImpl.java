package com.myproject.lms.dbo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.myproject.lms.util.*;
import com.myproject.lms.bean.Books;

public class BookFilterImpl implements BookFilters{

	Connection con = DatabaseConnection.con;
	PreparedStatement ps;
	
	public List<Books> FilterByCategory(String category) 
	{
		String sqlQuery="select * from library.books where category=?";
		List<Books> booksList =new ArrayList<Books>();
		
		try {
			ps = con.prepareStatement(sqlQuery);
			ps.setString(1, category);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				
				int bookId=rs.getInt("bookId");
				String bookName=rs.getString("bookName");
				String bookCategory=rs.getString("category");
				String authorName=rs.getString("authorName");
				
				Books book=new Books(bookId,bookName,bookCategory,authorName);
				booksList.add(book);
			}
			return booksList;
			
		} catch (SQLException e) {
			System.out.println("Exception in getting books by category"+e);
		}
		
		return null;
	}

	public List<Books> FilterByAuthorName(String Name) 
	{
		String sqlQuery="select * from library.books where authorname=?";
		List<Books> booksByAuthors =new ArrayList<Books>();
		
		try {
			ps = con.prepareStatement(sqlQuery);
			ps.setString(1,Name);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				
				int bookId=rs.getInt("bookId");
				String bookName=rs.getString("bookName");
				String bookCategory=rs.getString("category");
				String authorName=rs.getString("authorName");
				
				Books book=new Books(bookId,bookName,bookCategory,authorName);
				booksByAuthors.add(book);
			}
			return booksByAuthors;
			
		} catch (SQLException e) {
			System.out.println("Exception in getting books by name"+e);
		}
		
		return null;
	}

	public Books FilterByBookName(String name) {

		String sqlQuery="select * from library.books where bookname=?";
		
		try {
			ps = con.prepareStatement(sqlQuery);
			ps.setString(1,name);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				
				int bookId=rs.getInt("bookId");
				String bookName=rs.getString("bookName");
				String bookCategory=rs.getString("category");
				String authorName=rs.getString("authorName");
				
				Books book=new Books(bookId,bookName,bookCategory,authorName);
				
				return book;
			}

			
		} catch (Exception e) 
		{
			System.out.println("Exception in getting books by category"+e);
		}
		return null;
	}

	
		
}
