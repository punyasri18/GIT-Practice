package com.jwt.struts.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


import com.jwt.struts.form.UserRegisterForm;

public class UserRegisterDAO {
	
	//List<UserRegisterDAO> list = null;
	
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
//	try
//	{
//		PreparedStatement ps=con.prepareStatement("select * from struts_expenses");
//		ResultSet rs=ps.executeQuery();
//		while(rs.next()){
//			 UserRegisterForm user=new  UserRegisterForm();
//			 user.setEXP_ID(rs.getString(EXP_ID));
//			 
//			 System.out.println("hello.......")	; 
//			 
////			user.setName(rs.getString(2));
////			user.setPassword(rs.getString(3));
////			user.setEmail(rs.getString(4));
//list.addAll((Collection<? extends UserRegisterDAO>) user);
//		}
//		con.close();
//	}catch(Exception e){e.printStackTrace();}
//	
//	System.out.println("success");
//	
	}
	
}


