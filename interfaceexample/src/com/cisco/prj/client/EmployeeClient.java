package com.cisco.prj.client;

import com.cisco.prj.dao.EmployeeDao;
import com.cisco.prj.dao.EmployeeDaoMySQLImpl;
import com.cisco.prj.entity.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		Employee emp = new Employee("Smith", "smithy31@cisco.com"); 
		
		EmployeeDao empDao = new EmployeeDaoMySQLImpl();  
//		EmployeeDao empDao = new EmployeeDaoMongoImpl();
		empDao.addEmployee(emp);
	}

}
