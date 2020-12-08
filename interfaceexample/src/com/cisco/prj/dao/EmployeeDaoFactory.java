package com.cisco.prj.dao;

import java.util.ResourceBundle;

public class EmployeeDaoFactory {
	private static String str = "";
	
	// static block
	static {
		ResourceBundle res = ResourceBundle.getBundle("config");
		str = res.getString("EMP_DAO").trim();
	}
	
	public static EmployeeDao getEmployeeDao() {
		 try {
			 	return (EmployeeDao) Class.forName(str).newInstance();
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
		 return null;
	}
}
