package com.jdbcExample.hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jdbcExample.ConnectionFactory;

public class HelloJdbc {

	public static void main(String[] args) throws SQLException {

		Connection con = ConnectionFactory.openConnection();

		ConnectionFactory.closeConnection();

	}

}
