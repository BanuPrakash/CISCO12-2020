package com.cisco.prj.client;

import com.cisco.prj.entity.Account;

public class AccountClient {

	public static void main(String[] args) {
		Account swethaAcc = new Account("SB 500", 200);
		Account second = new Account();
		swethaAcc.deposit(5000);
		second.deposit(4500);
		
		System.out.println("first account");
		System.out.println(swethaAcc.getAccNo());
		System.out.println(swethaAcc.getBalance());
		
		System.out.println("second account");
		System.out.println(second.getAccNo());
		System.out.println(second.getBalance());
		Account some = new Account();
		
		System.out.println(Account.getCount()); // 3 
		
		Account divyaAcc = new Account("SB 500", 200);
		Account rahulAcc = new Account("SB 500", 200);
		
		if(divyaAcc == rahulAcc) {
			System.out.println("2 accounts are same");
		}
		
		if(divyaAcc.equals(rahulAcc)) {
			System.out.println("same content");
		}
		
		System.out.println(rahulAcc.getClass());
		System.out.println(rahulAcc.hashCode());
		
		System.out.println("**************");
		System.out.println(swethaAcc);
	}
}
