package JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemoWhereClause {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("org.postgresql.Driver");
		try (Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prachiDB", "postgres",
				"root")) {
			// Statement st=con.createStatement();
			PreparedStatement st = con.prepareStatement("SELECT * FROM STUDENT WHERE ROLL_NO=?");
			st.setInt(1, 105);
			System.out.println("FETCHING DATA WITH CONDITON");
			// String sql="SELECT Roll_No,NAME ,ADDRESS FROM STUDENT WHERE ROLL_NO>=103";
			// ResultSet rs=st.executeQuery(sql);

			// String sql="SELECT * FROM STUDENT ORDER BY ROLL_NO";
			// ResultSet rs=st.executeQuery(sql);

			// String sql="SELECT * FROM STUDENT WHERE ROLL_NO=109 or 1=1";
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				System.out.println("Roll_no:" + rs.getInt("roll_no") + " " + "Name:" + rs.getString("name") + " "
						+ "Address:" + rs.getString("address"));

			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
