package com.cisco.entity.prj;

@Table(name="emp")
public class Employee {
	private String name;
	private String email;
	
	public Employee() {
	}
	public Employee(String name, String email) {
		this.name = name;
		this.email = email;
	}
	@Column(name="emp_name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="emp_email", type="VARCHR(50)")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
