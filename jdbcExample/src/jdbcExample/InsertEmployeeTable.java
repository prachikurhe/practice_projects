package jdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertEmployeeTable {
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prachiDB", "postgres", "root");
			System.out.println("Opened database successfully");

			Statement statement = con.createStatement();
			
//			String sql ="INSERT INTO public.employee("
//					+ "	id, name, age, address, salary)"
//					+ "	VALUES (101, 'PRACHI', 23, 'KHARWANDI', 100000);";
			
			String sql ="INSERT INTO public.employee1("
					+ "	id, name, age, address, salary)"
					+ "	VALUES (102, 'SACHIN', 29, 'DIGHI', 100000);";
			
			
			statement.executeUpdate(sql);
			
			System.out.println("ROW is created ..");
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
