package com.myproject.lms.dbo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.myproject.lms.util.DatabaseConnection;

public class UserOperationsImpl implements UserOperations{

	Connection con=DatabaseConnection.con;
	PreparedStatement ps;
	
	public boolean searchBook(String bookname) 
	{
		String sqlQuery="select bookid from library.books where bookname=? ";
		
		try
		{
			ps=con.prepareStatement(sqlQuery);
			ps.setString(1, bookname);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("Book Available...!!");
				return true;
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Sorry..!!, Book Not Available"+e);
		}
		return false;
	}

	public boolean getBook(int userid,String bookname) {
		
		
		String sqlQuery="insert into library.bookrecords values(?,?)";
		try
		{
			ps=con.prepareStatement(sqlQuery);
			ps.setInt(1, userid);
			ps.setString(2, bookname);

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

	public boolean returnBook(int userid) {
		
		String sqlQuery="delete from library.bookrecords where userid=?";
		
		try
		{
			ps=con.prepareStatement(sqlQuery);
			ps.setInt(1,userid);
			
			int i=ps.executeUpdate();
			
			if(i==1)
				System.out.println("Returned Succesfully...!!!");
				return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception While Returning....!!!");
		}
		return false;
	}

	

	
}
