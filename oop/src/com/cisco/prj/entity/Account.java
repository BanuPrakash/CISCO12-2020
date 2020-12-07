/**
 * 
 */
package com.cisco.prj.entity;

/**
 * This is a entity class to represent account business data.
 * 
 * @author banup
 * @version 1.0
 */
public class Account {
	private double balance; // instance variable ==> state of object
	private String accNo;
	
	private static int count; // class member
	
	// default constructor
	public Account() {
		this.accNo = "NA";
		count++;
	}
	
	// parameterized
	public  Account(String accNo, double initialAmt) {
		this.accNo = accNo;
		this.balance = initialAmt;
		count++;
	}
	
	
	/**
	 * this method is for crediting amount into account.
	 * 
	 * @param amt amount to be credited
	 */
	public void deposit(double amt) {
		this.balance += amt;
	}
	
	/**
	 * this method gives the status of current balance amount.
	 * 
	 * @return current balance
	 */
	public double getBalance() {
		return balance; // this.balance
	}
	
	public String getAccNo() {
		return this.accNo;
	}
	
	// class methods
	public static int getCount() {
		return count;
	}

	//	divyaAcc.equals(rahulAcc)
	
	@Override
	public boolean equals(Object obj) {
		 // this refers to diyaAcc
		// rahulAcc is obj
		Account other = (Account) obj;
//		return this.accNo.equals(other.accNo);
		return this.balance == other.balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}
	
}
