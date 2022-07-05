package com.jdbc.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateEmployeeTable {

	private static String sql_query = "CREATE TABLE EMPLOYEE(ID INT,E_NAME CHAR(20), SALARY INT)";

	public static void main(String[] args) {

		try (Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc-demo", "postgres",
				"root"); Statement statement = con.createStatement();) {
			statement.execute(sql_query);
			System.out.println("Creat Table");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
