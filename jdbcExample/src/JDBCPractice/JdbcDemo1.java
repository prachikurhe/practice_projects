package JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prachiDB", "postgres", "root");
			
			Statement statement = con.createStatement();
			
			//String sql="CREATE TABLE Employee(EID CHAR(50), NAME CHAR(50))";
			String sql="CREATE TABLE Employee2(EName CHAR(20), Salary INT)";
			statement.execute(sql);
			
			System.out.println("table is created ..");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(con !=null || !con.isClosed() ) {
					con.close();
					System.out.println("closed connection");
				}
			}catch(SQLException e) {
				e.printStackTrace();
				
			}
		}

	}

}
