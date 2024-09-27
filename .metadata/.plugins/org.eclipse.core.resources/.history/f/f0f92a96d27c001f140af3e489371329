package com.fsjava;

import java.sql.*;

public class JDBCTest  {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Registering driver
		
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		//creating connection Object 
		String url="jdbc:mysql://localhost:3306/learn"; //database used learn
		String username="root";
		String password="faranaz";
	
			Connection con=DriverManager.getConnection(url,username,password);
			if(con!=null) {
				System.out.println("connection established");
			}else {
				System.out.println("connection not established");
			}
	
		
		//creating statement
		 Statement st=con.createStatement();
		//execute query
			String query="select * from Employees";
			ResultSet rs=st.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
		// close connection
			con.close();
		
	}

}
