package com.myproject.lms.dbo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.myproject.lms.util.DatabaseConnection;

public class RecordCheckImpl implements RecordCheck{

	
	Connection con =DatabaseConnection.con;
	PreparedStatement ps;
	
	public boolean checkRecord(int userid) 
	{
		String sqlQuery="select status from bookrecords where userid=?";
		
		try
		{
			ps=con.prepareStatement(sqlQuery);
			ps.setInt(1, userid);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				return false;
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception while checking record of the user...!!!");
		}
		return true;
	}
	
	
}
