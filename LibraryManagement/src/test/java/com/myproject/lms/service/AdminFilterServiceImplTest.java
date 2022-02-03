package com.myproject.lms.service;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.myproject.lms.bean.Books;
import com.myproject.lms.dbo.BookFilterImpl;
import com.myproject.lms.dbo.BookFilters;

public class AdminFilterServiceImplTest {

	public  BookFilters filterOperations;

	@Before
	public  void init()
	{
		filterOperations = new BookFilterImpl();
	}
	
	@Test
	public void testFilterByBookName() {
		
		String inputBookName="PythonTricks";
		Books exceptedOutput =new Books(14,"PythonTricks","Programming","DanBader",1984);
		Books actualOutput=filterOperations.FilterByBookName(inputBookName);
		assertEquals(exceptedOutput, actualOutput);
	}
	
	
	
	@Test
	public void testFilterByAuthorName() {
		
		String inputAuthorName="Danbader";
		
		List<Books> expectedOutput=Arrays.asList(new Books(13,"PythonTricksTheBook","Programming","DanBader",2000),
												new Books(14,"PythonTricks","Programming","DanBader",1984),
												new Books(15,"PythonBasics","Programming","DanBader",2002),
												new Books(16,"LetusPython","Programming","DanBader",2008));	
		
		List<Books> actualOutput=filterOperations.FilterByAuthorName(inputAuthorName);
		Assert.assertEquals(expectedOutput,actualOutput);

	}
	
	
	@Test
	public void testFilterByCategroy()
	{
		String inputCategory="Programming";
		
		List<Books> expectedOutput=Arrays.asList(
				new Books(13,"PythonTricksTheBook","Programming","DanBader",2000),
				new Books(14,"PythonTricks","Programming","DanBader",1984),
				new Books(15,"PythonBasics","Programming","DanBader",2002),
				new Books(16,"LetusPython","Programming","DanBader",2008),
				new Books(17,"NodejsinAction","Programming","MarcHarter",1999),
				new Books(18,"Nodejsinpractice","Programming","MarcHarter",2003));	

		List<Books> actualOutput=filterOperations.FilterByCategory(inputCategory);
		Assert.assertEquals(expectedOutput,actualOutput);
	}
	


}
