package com.myproject.lms.dbo;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.myproject.lms.Exceptions.InvalidCredentialsException;
import com.myproject.lms.util.DatabaseConnection;

public class UserCheckImpl implements UserCheck{

	
	Connection con=DatabaseConnection.con;
	PreparedStatement ps;
	
	public int checkLogin(String username, String password){
		
		String sqlQuery="select userid from library.user where username=? and password=?";
		
		try 
		{
			ps=con.prepareStatement(sqlQuery);
			ps.setString(1,username);
			ps.setString(2,password);
			
			int i=ps.executeUpdate();
			
			if(i>0)
			{
				return 1;
			}
		}
		catch(Exception e) {
			System.out.println("Invalid Credentials...@@Idiot");
		}
		
		return 0;
	}
}
