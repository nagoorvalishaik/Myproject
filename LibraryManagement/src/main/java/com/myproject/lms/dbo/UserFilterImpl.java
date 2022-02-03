package com.myproject.lms.dbo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.myproject.lms.bean.User;
import com.myproject.lms.util.DatabaseConnection;

public class UserFilterImpl implements UserFilter{

	Connection con = DatabaseConnection.con;
	PreparedStatement ps;
	
	public List<User> byCategory(String category) 
	{
		String sqlQuery="select * from library.user where designation=?";
		List<User> userList=new ArrayList<User>();
		try
		{
			ps=con.prepareStatement(sqlQuery);
			ps.setString(1, category);
			
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
				userList.add(u);
			}
				return userList;
		}
		catch(Exception e)
		{
			System.out.println("Exception while fetching the user"+e);

		}
		return null;
	}

	public List<User> byBranch(String branchName) 
	{
		String sqlQuery="select * from library.user where branch=?";
		List<User> userList=new ArrayList<User>();
		
		try {
				ps=con.prepareStatement(sqlQuery);
				ps.setString(1,branchName);
				
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
					userList.add(u);
				}
				
				return userList;
				
		}catch(Exception e) {
			System.out.println("Exception in getting user list..!!"+e);
		}
		return null;
	}

	public User byId(int id) {
		String sqlQuery="select * from library.user where userid=?";		
		try {
				ps=con.prepareStatement(sqlQuery);
				ps.setInt(1,id);
				
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
				
				
		}catch(Exception e) {
			System.out.println("Exception in getting user list..!!"+e);
		}		return null;	}

	public List<User> byYear(int y) {

		String sqlQuery="select * from library.user where year=?";
		List<User> userList=new ArrayList<User>();
		
		try {
				ps=con.prepareStatement(sqlQuery);
				ps.setInt(1,y);
				
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
					userList.add(u);
				}
				
				return userList;
		}catch(Exception e) {
			System.out.println("Exception in getting user list..!!"+e);
		}		return null;
	}

}
