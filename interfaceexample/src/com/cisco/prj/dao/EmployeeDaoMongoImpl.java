package com.cisco.prj.dao;

import com.cisco.prj.entity.Employee;

public class EmployeeDaoMongoImpl implements EmployeeDao {

	@Override
	public void addEmployee(Employee e) {
		System.out.println("mongodb store!!!");
	}

}
