package com.jwt.struts.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserRegisterDAO {
	public void insertData(String EXP_ID, String USER_ID, String EXP_RECORD_DATE,
			String EXP_DATE, String EXP_CATEGORY_ID, String EXP_DESC,String COST ) throws Exception {
		
		System.out.println("jdbc connection Started");
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl1","system","oracle");
		
		System.out.println("jdbc connected");

		try {

			try {
				Statement st = con.createStatement();
				int value = st
						.executeUpdate("INSERT INTO struts_expenses(EXP_ID , USER_ID, EXP_RECORD_DATE, EXP_DATE, EXP_CATEGORY_ID, EXP_DESC,COST) "
								+ "VALUES('"
								+ EXP_ID
								+ "','"
								+ USER_ID
								+ "','"
								+ EXP_RECORD_DATE
								+ "','"
								+ EXP_DATE
								+ "','"
								+ EXP_CATEGORY_ID
								+ "','" 
								+ EXP_DESC
								+ "','" 
								+ COST 
								+ "')");
				System.out.println("1 row affected in struts_expenses " + value);
			} catch (SQLException ex) {
				System.out.println("SQL statement is not executed!" + ex);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
