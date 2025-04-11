package com.StudentDb.Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class DAOServiceImpl implements DAOService {
private Connection conn;
private Statement stmt;
	@Override
	public boolean ConnectDb() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "banti@93682");
			stmt = conn.createStatement();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean verifyInquiry(String email, String password) {
		try {
		ResultSet result = stmt.executeQuery("SELECT * FROM login WHERE email = '"+email+"', password = '"+password+"' ");
		result.next();
	}catch(Exception e) {
		e.printStackTrace();
	}
return false;
	}
	@Override
	public void createInquiry(String name, String email, String mobile) {
		try {
		    stmt.executeUpdate("INSERT INTO StudentDetails VALUES('"+name+"', '"+email+"', '"+mobile+"')");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateInquiry(String mobile, String email) {
		try {
		   	stmt.executeUpdate("update StudentDetails where mobile='"+mobile+"' & email = '"+email+"'");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteInquiry(String email) { 
		try {
			stmt.executeUpdate("select * from StudentDetails where email = '"+email+"' ");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public ResultSet showData() {
		try {
		ResultSet result = stmt.executeQuery("SELECT * FROM StudentDetails");
		return result;
	}catch(Exception e) {
		e.printStackTrace();	
		}
		return null;
	}
}
