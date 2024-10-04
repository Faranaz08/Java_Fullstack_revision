package com.Mini;

import java.sql.*;
public class DBConnector {
	private Connection connection;
	public DBConnector(){
		
		try {
			//Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Creating Connection Object
			
			 connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","faranaz");
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
		public Connection getConnection () {
			return connection;
			}
			
			public void closeConnection() {
			try {
			if (connection != null && !connection.isClosed())
			{
			connection . close () ;
			}
			}
			catch (SQLException e) {
			e. printStackTrace () ;
			}
			}
		
		
		
		
		
	}


