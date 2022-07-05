package JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDemoUserdefinedDataInsert {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter email id:");
		String emailId = scanner.nextLine();
		System.out.println("Please enter username:");
		String name=scanner.nextLine();
		
		
		
		Class.forName("org.postgresql.Driver");
		try(Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/prachiDB", "postgres", "root"))
		{
			String sql="INSERT INTO EMPLOYEE (EID,NAME) VALUES(?,?)";
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1, emailId);
			st.setString(2, name);
			
			int rows = st.executeUpdate();
			System.out.println(rows+" rows inserted..");
			
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
