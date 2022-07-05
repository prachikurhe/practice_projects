package JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemoDrop {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("org.postgresql.Driver");
		try(Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/prachiDB", "postgres","root"))
		{
			Statement st= con.createStatement();
			st.execute("DROP TABLE EMPLOYEE");
			System.out.println("Table is deleted in given database...");
		

	}catch(SQLException e) {
		e.printStackTrace();
	}

}
}
