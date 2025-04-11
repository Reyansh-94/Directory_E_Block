package com.StudentDb.Model;

import java.sql.ResultSet;

public interface DAOService {
	public boolean ConnectDb();
	public boolean verifyInquiry(String email, String password);
	public void createInquiry(String name, String email, String mobile);
	public void updateInquiry(String mobile, String email);
	public void deleteInquiry(String email);
	public ResultSet showData();
}
