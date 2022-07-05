package jdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.ThreadLocalRandom;

public class UpdateEmployee {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("org.postgresql.Driver");
		
		try (Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prachiDB", "postgres",
				"root")) 
		{
			
			Statement statement = con.createStatement();
			//con.setAutoCommit(false);
			int isupdated = statement.executeUpdate("UPDATE EMPLOYEE1 SET NAME='PRACHI' WHERE ID= 102");
			
			System.out.println("The row updated.."+isupdated);
	
//			Thread.currentThread().sleep(10000);
//			con.rollback();
//			System.out.println("Rolled back");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
