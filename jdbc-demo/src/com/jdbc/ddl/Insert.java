package com.jdbc.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://localhost:5432/jdbc-demo";
		String username="postgres";
		String password="root";
		
		try (Connection con=DriverManager.getConnection(url,username,password)){
			
			
			Statement st=con.createStatement();
			String sql="Insert into employee values(103,'Manisha',110000)";
			st.execute(sql);
			System.out.println("Row is inserted...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
