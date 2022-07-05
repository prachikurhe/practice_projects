package jdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectEmployeeTable {
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
			
			String sql ="SELECT * FROM employee1";
			
			
			 ResultSet res = statement.executeQuery(sql);
			
			 System.out.println("ID\tNAME\tage\taddress\tsalary");
			 while(res.next()) {
				 int id = res.getInt(1);
				 String name = res.getString(2);
				 int age = res.getInt(3);
				 String address = res.getString(4);
				 int salary = res.getInt(5);
				 System.out.println(id+"\t "+name+"\t"+age+"\t"+address.trim()+"\t"+salary);
			 }
			 
			System.out.println("ROW is retrived ..");
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
