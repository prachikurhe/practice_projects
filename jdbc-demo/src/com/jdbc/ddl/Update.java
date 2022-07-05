package com.jdbc.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://localhost:5432/jdbc-demo";
		String username="postgres";
		String password="root";
		
		try(Connection con=DriverManager.getConnection(url,username,password)){
			Statement st=con.createStatement();
			String sql="update employee set e_name='Prachi Kurhe' where id=102";
			st.executeUpdate(sql);
			System.out.println("Update successfully...");
			
			ResultSet rs=st.executeQuery("select * from employee");
			while(rs.next()) {
				System.out.println("Id:"+rs.getInt("Id")+" "+"E_name:"+rs.getString("E_name")+" "+"Salary:"+rs.getInt("Salary"));
			}
			rs.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
