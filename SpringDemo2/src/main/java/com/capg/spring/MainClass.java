package com.capg.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");  
		
		
		Account a1 =(Account)context.getBean("Nagoor");
		Account a2 =(Account)context.getBean("Nagoorvali");

		System.out.println(a1);
		System.out.println(a1.getP());
		System.out.println(a1.getFile());
		System.out.println(a1.getStocks());
		System.out.println();
		System.out.println("Account-2");
		System.out.println(a2);
		System.out.println(a2.getStocks());
	}
}
