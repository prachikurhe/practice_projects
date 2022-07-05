package JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemoCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prachiDB", "postgres", "root");
			
			Statement statement = con.createStatement();
			
			String sql="CREATE TABLE STUDENT(ROLL_NO INT PRIMARY KEY, NAME CHAR(10), ADDRESS CHAR(12))";
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
