package P1;
import java.sql.*;
public class SQlStatement {
public static void main(String[] args) {
//Connect to database
	
	try {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students", "root", "banti@936827");
		System.out.print(conn);
		
		//	Execute sql query
		Statement stmt = conn.createStatement();
// Delete query
//		stmt.executeUpdate("DELETE FROM preetam WHERE email = 'psm111@gmail.com'");
//		Update Query
		stmt.executeUpdate("UPDATE preetam SET Email = 'psm64963@gmail.com' WHERE id = 105");
		//	Close database connection
		conn.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}


}
}

