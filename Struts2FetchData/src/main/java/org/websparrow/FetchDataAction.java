package org.websparrow;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class FetchDataAction extends ActionSupport {
	List<FetchDataBean> dataList = null;
	ResultSet rs = null;
	String fetchData = null;
	FetchDataDAO daoObj = null;
	// Generate Getters and Setters...

	public String execute() throws Exception {
		try {
			if (fetchData.equals("FetchRecords")) {
				dataList = new ArrayList<FetchDataBean>();
				FetchDataBean dataBean = null;
				rs = new FetchDataDAO().fetchData();
				if (rs != null) {
					while (rs.next()) {
						dataBean = new FetchDataBean();
						dataBean.setName(rs.getString("NAME"));
						dataBean.setEmail(rs.getString("EMAIL"));
						dataBean.setMobile(rs.getString("MOBILE"));
						dataBean.setCollege(rs.getString("COLLEGE"));
						dataBean.setCourse(rs.getString("COURSE"));
						dataBean.setSkills(rs.getString("SKILLS"));
						dataBean.setMarks1(rs.getInt("MARKS1"));
						dataBean.setMarks2(rs.getInt("MARKS2"));
						dataBean.setMarks3(rs.getInt("MARKS3"));
						dataList.add(dataBean);

					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "SUCCESS";

	}

	public List<FetchDataBean> getDataList() {
		return dataList;
	}

	public void setDataList(List<FetchDataBean> dataList) {
		this.dataList = dataList;
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	public String getFetchData() {
		return fetchData;
	}

	public void setFetchData(String fetchData) {
		this.fetchData = fetchData;
	}

	public FetchDataDAO getDaoObj() {
		return daoObj;
	}

	public void setDaoObj(FetchDataDAO daoObj) {
		this.daoObj = daoObj;
	}

}
