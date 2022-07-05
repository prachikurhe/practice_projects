package JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemoUpdate {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("org.postgresql.Driver");
		try(Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/prachiDB", "postgres", "root"))
		{
			Statement st=con.createStatement();
			
			String sql="UPDATE STUDENT SET NAME='PRADNYA' WHERE ROLL_NO=104";
		    st.executeUpdate(sql);
		    
		    sql="UPDATE STUDENT SET NAME='TUSHAR' WHERE ROLL_NO=105";	
		    st.executeUpdate(sql);
			System.out.println("UPDATE STUDENT TABLE SUCCESSFULLY");
			ResultSet rs=st.executeQuery("SELECT ROLL_NO, NAME, ADDRESS FROM STUDENT");
			
			while(rs.next()) {
				System.out.println("ROLL_NO:"+rs.getInt("ROLL_NO")+ "," +"NAME:"+rs.getString("NAME") +","+"ADDRESS:"+rs.getString("ADDRESS"));
			}
			rs.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
