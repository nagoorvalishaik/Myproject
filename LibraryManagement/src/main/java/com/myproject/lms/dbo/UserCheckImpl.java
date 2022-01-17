package com.myproject.lms.dbo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.myproject.lms.util.DatabaseConnection;

public class UserCheckImpl implements UserCheck{

	
	Connection con=DatabaseConnection.con;
	PreparedStatement ps;
	
	public boolean checkLogin(String username, String password){
		
		String sqlQuery="select userid from library.user where username=? and password=?";
		
		try 
		{
			ps=con.prepareStatement(sqlQuery);
			ps.setString(1,username);
			ps.setString(2,password);
			
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				return true;
			}
		}
		catch(Exception e) {
			System.out.println("Invalid Credentials...@@Idiot");
		}
		
		return false;
	}
}
