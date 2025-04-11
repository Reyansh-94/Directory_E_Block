package P1;
import java.sql.*;
import java.util.Scanner;
public class Core1 {
public static void main(String[] args) {
//Connect to database
	
	try {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your id: ");
		int id = scan.nextInt();
		System.out.println("Enter your password: ");
		String pass = scan.next();
		System.out.println("Enter your FullName: ");
		String FullName = scan.next();
		System.out.println("Enter your Email: ");
		String Email = scan.next();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students", "root", "banti@936827");
		
		//	Execute sql query
		Statement stmt = conn.createStatement();
//		Insert Query:-
		stmt.executeUpdate("insert into preetam values("+id+", '"+pass+"', '"+FullName+"', '"+Email+"')");

		conn.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}


}
}
