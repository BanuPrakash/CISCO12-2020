package com.cisco.prj.dao;

import com.cisco.prj.entity.Employee;

public class EmployeeDaoMySQLImpl implements EmployeeDao {

	@Override
	public void addEmployee(Employee e) {
		System.out.println("stored in MySQL!!!");
	}

}
