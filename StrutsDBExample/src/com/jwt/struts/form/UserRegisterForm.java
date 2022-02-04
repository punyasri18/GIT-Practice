package com.jwt.struts.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class UserRegisterForm extends ActionForm {

	//private static final long serialVersionUID = 1L;
	private String EXP_ID;
	private String USER_ID;
	private String EXP_RECORD_DATE;
	private String EXP_DATE;
	private String EXP_CATEGORY_ID;
	private String EXP_DESC;
	private String COST;
	
	 
	public String getEXP_ID() {
		return EXP_ID;
	}


	public void setEXP_ID(String eXP_ID) {
		EXP_ID = eXP_ID;
	}


	public String getUSER_ID() {
		return USER_ID;
	}


	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}


	public String getEXP_RECORD_DATE() {
		return EXP_RECORD_DATE;
	}


	public void setEXP_RECORD_DATE(String eXP_RECORD_DATE) {
		EXP_RECORD_DATE = eXP_RECORD_DATE;
	}


	public String getEXP_DATE() {
		return EXP_DATE;
	}


	public void setEXP_DATE(String eXP_DATE) {
		EXP_DATE = eXP_DATE;
	}


	public String getEXP_CATEGORY_ID() {
		return EXP_CATEGORY_ID;
	}


	public void setEXP_CATEGORY_ID(String eXP_CATEGORY_ID) {
		EXP_CATEGORY_ID = eXP_CATEGORY_ID;
	}


	public String getEXP_DESC() {
		return EXP_DESC;
	}


	public void setEXP_DESC(String eXP_DESC) {
		EXP_DESC = eXP_DESC;
	}


	public String getCOST() {
		return COST;
	}


	public void setCOST(String cOST) {
		COST = cOST;
	}


//	public static long getSerialversionuid() {
//		return serialVersionUID;
//	}
//

	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		
		if (EXP_ID == null || EXP_ID.length() < 1) {
			errors.add("EXP_ID", new ActionMessage("error.EXP_ID.required"));

		}
		if (USER_ID == null || USER_ID.length() < 1) {
			errors.add("USER_ID", new ActionMessage("error.USER_ID.required"));

		}
		if (EXP_RECORD_DATE == null || EXP_RECORD_DATE.length() < 1) {
			errors.add("EXP_RECORD_DATE", new ActionMessage("error.EXP_RECORD_DATE.required"));

		}
		if (EXP_DATE == null || EXP_DATE.length() < 1) {
			errors.add("EXP_DATE", new ActionMessage("error.EXP_DATE.required"));

		}
		if (EXP_CATEGORY_ID == null || EXP_CATEGORY_ID.length() < 1) {
			errors.add("EXP_CATEGORY_ID", new ActionMessage("error.EXP_CATEGORY_ID.required"));

		}
		if (EXP_DESC == null || EXP_DESC.length() < 1) {
			errors.add("EXP_DESC", new ActionMessage("error.EXP_DESC.required"));

		}
		if (COST == null || COST.length() < 1) {
			errors.add("EXP_DESC", new ActionMessage("error.COST.required"));

		}
		return errors;
	}

}