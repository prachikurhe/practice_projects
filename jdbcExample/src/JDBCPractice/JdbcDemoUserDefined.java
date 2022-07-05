package JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDemoUserDefined {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp name");
		String name=sc.nextLine();
		System.out.println("Enter salary");
		int salary=sc.nextInt();
		
		Class.forName("org.postgresql.Driver");
		try(Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/prachiDB", "postgres", "root"))
		{
			String sql="INSERT INTO EMPLOYEE2 (ENAME,SALARY) VALUES(?,?)";
			
			PreparedStatement pt=con.prepareStatement(sql);
			pt.setString(1, name);
			pt.setInt(2, salary);
			pt.executeUpdate();
			System.out.println("row inserted...");
			
			System.out.println("Employee Data...");
			Statement st=con.createStatement();
			
			String sql1="Select * from employee2";
			ResultSet rs=st.executeQuery(sql1);
			while(rs.next()) {
				System.out.println("EName:"+rs.getString("ename")+"Salary:"+rs.getInt("salary"));
			}
			
			rs.close();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
