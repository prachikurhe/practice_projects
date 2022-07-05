package com.demo.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDAO {
	public Student getStudent(int roll_no) {
		try {
		Student s=new Student();
		//s.roll_no=roll_no;
		
		Class.forName("org.postgresql.Driver");//load driver 1 step
		//create connection object
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/prachiDB", "postgres", "root");
		//create statement
		Statement st=con.createStatement();
	    //prepare query
		String query="select name from student where roll_no="+roll_no;
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String name=rs.getString(1);
		s.name=name;
		return s;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
