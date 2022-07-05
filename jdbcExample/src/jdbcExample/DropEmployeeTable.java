package jdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropEmployeeTable {
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prachiDB", "postgres", "root");
			System.out.println("Opened database successfully");

			Statement statement = con.createStatement();
			
			String sql = "DROP TABLE EMPLOYEE";
			
			statement.execute(sql);
			
			System.out.println("table is dropped ..");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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
