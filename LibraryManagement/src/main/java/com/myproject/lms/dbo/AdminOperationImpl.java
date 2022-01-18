package com.myproject.lms.dbo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.myproject.lms.bean.Books;
import com.myproject.lms.bean.User;
import com.myproject.lms.util.DatabaseConnection;


public class AdminOperationImpl implements AdminOperations{

	Connection con=DatabaseConnection.con;
	PreparedStatement ps;
	
	public boolean addUser(User us) {
		
		String sqlQuery="insert into library.user values(?,?,?,?,?,?,?)";
		try
		{
			ps=con.prepareStatement(sqlQuery);
			
			ps.setInt(1, us.getUserId());
			ps.setString(2,us.getUserName());
			ps.setString(3, us.getGender());
			ps.setString(4,us.getBranch());
			ps.setString(5, us.getDesignation());
			ps.setInt(6, us.getYear());
			ps.setString(7, us.getPassword());
			

			int i=ps.executeUpdate();
			if(i==1)return true;
			return false;
		}
		catch(Exception e)
		{
			System.out.println("Exception occured at Inserting Data...!!\n\n");
		}
		return false;
	}
	

	public boolean deleteUser(int userid) {
		
		String sqlQuery="delete from library.user where userid=?";
		
		try
		{
			ps=con.prepareStatement(sqlQuery);
			ps.setInt(1,userid);
			
			int i=ps.executeUpdate();
			
			if(i==1)
				System.out.println("Deleted Succesfully...!!!");
				return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception while deleting user....!!!");
		}
		return false;
	}

	public User getUser(int userid)
	{
		
		String sqlQuery="select * from library.user where userid=?";
		
		try
		{
			ps=con.prepareStatement(sqlQuery);
			ps.setInt(1, userid);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				int userId=rs.getInt("userid");
				String userName=rs.getString("userName");
				String gender=rs.getString("gender");
				String branch=rs.getString("branch");
				String designation=rs.getString("designation");
				int year=rs.getInt("year");
				
				User u=new User(userId,userName,gender,branch,designation,year,null);
				
				return u;
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception while fetching the user"+e);

		}
		
		return null;
	}

	public boolean addBook(Books book) {
		
		String sqlQuery="insert into library.books values(?,?,?,?)";
		try
		{
			ps=con.prepareStatement(sqlQuery);
			ps.setInt(1, book.getBookId());
			ps.setString(2, book.getBookName());
			ps.setString(3, book.getBookCategory());
			ps.setString(4, book.getAuthorName());
			
			int i=ps.executeUpdate();
			if(i==1)return true;
			return false;
		}
		catch(Exception e)
		{
			System.out.println("Exception occured at Inserting Data...!!\n\n");
		}
		return false;
	}


		public Books getBook(String name){
		
			String sqlQuery="select * from library.books where bookname=?";
			
			try
			{
				ps=con.prepareStatement(sqlQuery);
				ps.setString(1, name);
				
				ResultSet rs=ps.executeQuery();
				
				while(rs.next())
				{
					int bookId=rs.getInt("bookId");
					String bookName=rs.getString("bookName");
					String bookCategory=rs.getString("bookCategory");
					String authorName=rs.getString("authorName");
					
					Books b=new Books(bookId,bookName,bookCategory,authorName);
					
					return b;
				}
				
			}
			catch(Exception e)
			{
				System.out.println("Exception while fetching the user"+e);
	
			}
			
		return null;
	}


		public boolean deleteBook(String bookname) {
			
			String sqlQuery="delete from library.books where bookname=?";
			try
			{
				ps=con.prepareStatement(sqlQuery);
				ps.setString(1,bookname);
				
				int i=ps.executeUpdate();
				
				if(i==1)
					System.out.println("Deleted Succesfully...!!!");
					return true;
			}
			catch(Exception e)
			{
				System.out.println("Exception while deleting user....!!!");
			}
			return false;
		}


}


	

	

