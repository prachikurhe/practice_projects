package com.jdbc.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Drop {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://localhost:5432/jdbc-demo";
		String username="postgres";
		String password="root";
		
		try(Connection con=DriverManager.getConnection(url,username,password)){
			Statement st=con.createStatement();
			String sql="Drop table employee";
			st.executeUpdate(sql);
			System.out.println("Drop successfully...");
			

	}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}