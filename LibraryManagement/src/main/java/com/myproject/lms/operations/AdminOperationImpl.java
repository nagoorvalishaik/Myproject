package com.myproject.lms.operations;
import com.myproject.lms.bean.Books;
import com.myproject.lms.bean.Professor;
import com.myproject.lms.bean.Student;
import com.myproject.lms.bean.User;
import com.myproject.lms.util.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.myproject.lms.Exceptions.InvalidUserIdException;
import com.myproject.lms.Exceptions.UserAlreadyExistsException;


public class AdminOperationImpl implements AdminOperations{

	
	Connection con=DatabaseConnection.con;
	PreparedStatement ps;

	public boolean addUser(Object o) throws UserAlreadyExistsException 
	{
		
		Connection con=DatabaseConnection.con;
		PreparedStatement ps;
		
		
			if(o instanceof Student)
			{	
					Student s=new Student();
					try
					{
						String sqlQuery = "insert into capg.account values(?,?,?,?,?,?)";
						ps = con.prepareStatement(sqlQuery);
						int i = ps.executeUpdate(); // DML, i holds the value :- number of rows effected
						if(i==1) return true;
						return false;
					}
					catch(Exception e)
					{
						System.out.println("Exception while Data Insertion "+e);
					}
			}
			else 
			{	
				Professor p=new Professor();
				try
				{
					String sqlQuery = "insert into capg.account values(?,?,?,?,?,?)";
					ps = con.prepareStatement(sqlQuery);
					int i = ps.executeUpdate(); // DML, i holds the value :- number of rows effected
					if(i==1) return true;
					return false;
				}
				catch(Exception e)
				{
					System.out.println("Exception while Data Insertion "+e);
				}	
			}
			return false;
		
	}


	public boolean removeUser(int userid) throws InvalidUserIdException 
	{	
		
		try
		{
			String sqlQuery = "";
			ps = con.prepareStatement(sqlQuery);
			int i = ps.executeUpdate(); // DML, i holds the value :- number of rows effected
			if(i==1) return true;
			return false;
		}
		catch(Exception e)
		{
			System.out.println("Exception while Data Insertion "+e);
		}
		
		return false;
	}

	public boolean addBook(Books book) {
		
		try
		{
			String sqlQuery = "";
			ps = con.prepareStatement(sqlQuery);
			int i = ps.executeUpdate(); // DML, i holds the value :- number of rows effected
			if(i==1) return true;
			return false;
		}
		catch(Exception e)
		{
			System.out.println("Exception while Data Insertion "+e);
		}
		return false;
	}

	public List<Object> getAllUsers() {
		try
		{
			String sqlQuery = "";
			ps = con.prepareStatement(sqlQuery);
			int i = ps.executeUpdate(); // DML, i holds the value :- number of rows effected
		}
		catch(Exception e)
		{
			System.out.println("Exception while Data Insertion "+e);
		}
		return null;
		
	}

	public Object getUSerDetailsById(int userid) {
		// TODO Auto-generated method stub
		return null;
	}


	

	
}
