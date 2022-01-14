package com.myproject.lms.dbo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.myproject.lms.Exceptions.InvalidUserIdException;
import com.myproject.lms.Exceptions.UserDoesnotExistsException;
import com.myproject.lms.bean.Books;
import com.myproject.lms.bean.User;
import com.myproject.lms.util.DatabaseConnection;


public class AdminOperationImpl implements AdminOperations{

	Connection con=DatabaseConnection.con;
	PreparedStatement ps;
	public boolean addUser(User user) {
		
		String sqlQuery="insert into library.user values(?,?,?,?,?,?,?)";
		try
		{
			ps=con.prepareStatement(sqlQuery);
			ps.setInt(1, user.getUserId());
			ps.setString(2,user.getUserName());
			ps.setString(3,user.getGender());
			ps.setString(4,user.getBranch());
			ps.setString(5,user.getDesignation());
			ps.setInt(6,user.getYear());
			ps.setString(7, user.getPassword());
			
			int i=ps.executeUpdate();
			if(i==1) {
				System.out.println("Use added succesfully...##");
				return true;
			}
			return false;
		}
		catch(Exception e)
		{
			System.out.println("Exception occured while Inserting Data...!!\n\n");
		}
		return false;
	}

	public boolean deleteUser(int userid) {
		
		String sqlQuery="update library.user where userid=?";
		
		try
		{
			ps=con.prepareStatement(sqlQuery);
			ps.setInt(1,userid);
			
			int i=ps.executeUpdate();
			if(i==1)return true;
			return false;
		}
		catch(Exception e)
		{
			System.out.println("Exception while deleting user....!!!");
		}
		return false;
	}

	public User getUser(int userid)
	{
		
		String sqlQuery="select *from library.user where userid=?";
		
		try
		{
			ps=con.prepareStatement(sqlQuery);
			ps.setInt(1, userid);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				int userId=rs.getInt("userid");
				String userName=rs.getString("userName");
				String gender=rs.getString("gende");
				String branch=rs.getString("branch");
				String designation=rs.getString("designation");
				int year=rs.getInt("year");
				String password=rs.getString("password");
				
				User u=new User(userId,userName,gender,branch,designation,year,password);
				
				return u;
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception while fetching the user");
		}
		return null;
	}

	public boolean addBook(Books book) {
		
		String sqlQuery="insert into library.books values(?,?,?,?,?,?)";
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
	
	
	
	}


	

	

