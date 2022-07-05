package com.jdbc.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementQuery {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://localhost:5432/jdbc-demo";
		String username="postgres";
		String password="root";
		
		try(Connection con=DriverManager.getConnection(url,username,password)){
			String sql="Insert into employee (e_name,salary)values(?,?)";
			PreparedStatement pt=con.prepareStatement(sql);
			pt.setString(1, "Atharv");
			pt.setInt(2, 70000);
			pt.execute();
			
			System.out.println("INSERTED....");
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
	
