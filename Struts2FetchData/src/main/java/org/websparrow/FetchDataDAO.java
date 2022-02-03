package org.websparrow;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchDataDAO {

	public ResultSet fetchData() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","system","oracle");
			String query = "SELECT NAME,  EMAIL ,  MOBILE ,  COLLEGE ,  COURSE,  SKILLS ,  MARKS1 ,  MARKS2 ,  MARKS3 FROM pdfreport";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
