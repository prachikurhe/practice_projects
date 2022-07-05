package JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemoInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
			Class.forName("org.postgresql.Driver");
			 con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/prachiDB", "postgres", "root");
			
			Statement st=con.createStatement();
			System.out.println("Inserting records into the table:");
			st.executeUpdate("INSERT INTO STUDENT VALUES(101,'PRACHI','KHARWANDI'),("
					+ "102,'MANISHA','DIGHI'),("
					+ "103,'KAVITA','SHIRAL')");
			
			
			
			st.executeUpdate("INSERT INTO STUDENT VALUES(104,'PRACHI1','KHARWANDI'),("
					+ "105,'MANISHA1','DIGHI'),("
					+ "106,'KAVITA1','SHIRAL')");
			
			
			System.out.println("ROW IS CREATED");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if (con != null || !con.isClosed())
				{
					con.close();
					System.out.println("closed connection");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		

	}
		
}
	}
}
