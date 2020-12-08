package com.cisco.entity.client;

import com.cisco.entity.prj.Employee;
import com.cisco.entity.prj.Product;
import com.cisco.entity.util.DBUtil;

public class SQLClient {

	public static void main(String[] args) {
		String sql = DBUtil.createStatement(Product.class);
		System.out.println(sql);
		
		sql = DBUtil.createStatement(Employee.class);
		System.out.println(sql);
	}

}
