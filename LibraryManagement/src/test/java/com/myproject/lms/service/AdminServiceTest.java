package com.myproject.lms.service;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.myproject.lms.Exceptions.InvalidUserException;
import com.myproject.lms.bean.Books;
import com.myproject.lms.bean.User;

public class AdminServiceTest {

	public AdminService ads;
	@Before
	public  void init() {
		
		ads=new AdminServiceImpl();
	}
	
	
	
	  @Test 
	  public void testAddUser()
	  {
		  
		  boolean expected=true; 
		  User u=new User(5,"Saleem","male","cse","student",5,"125");
		  boolean actual=ads.addUser(u);
		  
		  assertEquals(expected,actual); 
	  }
	  
	  @Test
	  public void testDeleteUser()
	  {
		  boolean expected=true; 
		  int userid=5;
		  boolean actual=ads.deleteUser(userid);
		  
		  assertEquals(expected,actual); 
	}
	 

	@Test
	public void testGetUser() throws InvalidUserException{
		
		int input=15;
		User actual=ads.getUser(input);
		User expected=null;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testAddBook() 
	{	
		boolean expected=false;
		boolean actual =ads.addBook(new Books(143,"EndGame","Scifi","nagoor",1999));
		
		assertEquals(expected,actual);
	}

	@Test
	public void testDeleteBook() 
	{
		String input="PythonTricks";
		boolean expected =false;
		boolean actual=ads.deleteBook(input);
		assertEquals(expected,actual);
	}

}
