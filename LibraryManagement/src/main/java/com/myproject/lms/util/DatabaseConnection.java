package com.myproject.lms.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

	public static Connection con;
	
	static
	{
		// username of db admin and password 
		// port number 
		String host = "localhost:3306";  // if DB is another machine , that machine IP address should be given
        String database = "capg";
        String url = "jdbc:mysql://"+ host+"/"+database;
        String username = "root";
        String password = "admin";
        
        try {


            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            System.out.println("[ Connection Established  "+con+"  ]\n\n--------------------------------\n");

		} catch (Exception e) {
			System.out.println(" Exception during DB Connection "+e);
		}
		
	}
}
