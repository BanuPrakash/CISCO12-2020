package com.cisco.prj.client;

public class HashCodeExample {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		String s3 = new String ("hello");
		System.out.println(s3.hashCode());
		
		String s4 = new String("Aa");
		String s5 = new String("BB");
		
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
	}

}
