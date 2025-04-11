package P1;
	import java.sql.*;
import java.util.Scanner;
	public class Core3 {
	public static void main(String[] args) {
	//Connect to database
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/augustbatch", "root", "banti@936827");
			System.out.print(conn);
			
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery("SELECT * FROM registration");
			while(result.next()) {
				System.out.println(result.getString(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}
	}


