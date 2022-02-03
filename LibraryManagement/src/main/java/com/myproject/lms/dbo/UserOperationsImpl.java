package com.myproject.lms.dbo;

import java.sql.Connection;
import java.sql.Date;
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
			
			if(rs!=null) {
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

	public boolean requestBook(int userid,String bookname) 
	{
		String sqlQuery="insert into library.bookrecords values(?,?,?,?,?)";
		String status="issued";
		
		Date issuedDate=new Date(System.currentTimeMillis());
		long newDate=issuedDate.getTime()+10*24*60*60*1000;
	
		Date returnDate=new Date(newDate);
		try
		{
			ps=con.prepareStatement(sqlQuery);
			ps.setInt(1, userid);
			ps.setString(2, bookname);
			ps.setDate(3, issuedDate);
			ps.setDate(4, returnDate);
			ps.setString(5,status);
			
			int i=ps.executeUpdate();
			if(i==1) {
				System.out.println("Please return before "+returnDate+" to avoid fine");
				return true;
			}
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
			
			if(i==1) {
				System.out.println("Returned Succesfully...!!!");
				return true; }
		}
		catch(Exception e)
		{
			System.out.println("No Data Available...!!!");
		}
		return false;
	}

	

	
}
