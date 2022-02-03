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
        String database = "library";
        String url = "jdbc:mysql://"+ host+"/"+database;
        String username = "root";
        String password = "125867";
        
        try {

            //Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);

		} catch (Exception e) {
			System.out.println(" Exception during DB Connection "+e);
		}
		
	}
}
