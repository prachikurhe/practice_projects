package com.demo.jdbc.example;

public class JdbcDemoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDAO dao=new StudentDAO();
		
		Student s1=dao.getStudent(101);
		System.out.println(s1.name);
		
	}

}
