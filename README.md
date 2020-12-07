# Java
Banuprakash C

Full Stack Architect,

Co-founder Lucida Technologies Pvt Ltd.,

Corporate Trainer,

Email: banu@lucidatechnologies.com; banuprakashc@yahoo.co.in

https://www.linkedin.com/in/banu-prakash-50416019/

https://github.com/BanuPrakash/CISCO12-2020

-----------------------------------------------------

Softwares Required:
1) Java 8+
	https://www.oracle.com/in/java/technologies/javase/javase-jdk8-downloads.html
2) Eclipse for JEE  
	https://www.eclipse.org/downloads/packages/release/2020-03/m1/eclipse-ide-enterprise-java-developers
3) MySQL  [ will share the installation details pdf]


-----------

3.5 day ==> Java 
Web application ; Spring Framework

--------------------------------------------
	
	Object oriented programming: OOP
		real - world application: objects communicate with each other by sending message

		What a message does. Don;t bother about how 

		-------------------

		Object will have state and behaviour. State of object will be chaged using behaviour

		Account : ==> balance is the state; credit() and debit(); 

	------------------

	What is Java?
		==> Technology ==> platform for executing bytecode + API

		Bytecode is compiled code.

		1) 	Java language ===> JDK [ Java Development kit ] java compiler ==> bytecode
		2)  Kotlin ==> Kotlin DK ==> Kotlin Compiler ===> bytecode
		3)  Groovy ..

    -----------------------------------------------
    Account.java

    public class Account {
    	private double balance;

    	public void deposit(double amt) {
    		this.balance += amt;
    	}

    	public double getBalance() {
    		return balance;
    	}
    }


    AccountClient.java

    public class AccountClient {
    	public static void main(String[] args) {
    		Account first = new Account();
    		first.deposit(5000);
    		System.out.println(first.getBalance());

    		Account sec = new Account();
    		sec.deposit(4500);
    		System.out.println(sec.getBalance());

    	}
    }

    "new" keyword is for Dynamic memory allocation [ on heap area]


    first.deposit(5000);

    OOP: context.behaviour(arguments); context.action(..) 

    	==> deposit(first, 5000); 


    	public void deposit(double amt) {    ==> public void deposit(Account this, double amt) 
    		this.balance += amt;
    	}

 

 ClassLoaders loads the class: .class files ==> secondary storage / Network

 classloders loads class into primary storage [ RAM / JVM ]

 ==============================================================================================

 Enterprise applications using java; logically group classes

 1) entity/ domain/ model class
 	business data classes.
 	Customer, Product, Order,
 	Trip, Customer, Vehicle, Driver, Payment
 	==> storage [ SQL / NoSQL / LDAP / persistence mechansim]
 
 2) DAO [ Data Access Object ]
 		they contain mechism to perform CRUD operation on storage
 		if storage is RDBMS;we will have SQL like INSERT, DELETE, SELECt ,...
 		==> fine grained
 3) Service classes
 		they act like facade over many DAO operations and other business operations
 		giving coarse grained operations on fine grained
 		==> combine many DAO operations which has to be atomic

 		public void transferFunds(Account first, Account sec, double amt) {
 			begin transaction
 				DAO Operation :select if sufficient balance is present
 				DAO Operation : update first account
 				DAO operation: update second account
 				DAO operation : insert into transaction table
 				Send SMS
 				send EMAIL
 			commit transaction

 			exception ROLLBACK
 		}
 4) Exception classes
 5) Utility classes and helper classes
 6) UI classes or client code classes

==============================================================================

OOP: follow the SOLID Design Principle

S ==> Single Responsibility
O ==> Open Close Principle
	Closed for a change; open for extension
L ==> Liskov Substitution Principle
I ==> Interface segregation
D ==> Dependency Injection

======================================================
 
 package names:
 	com.cisco.prj.entity;

 	com.cisco.prj.service;


 	com
 	 |
 	 cisco
 	 	|
 	 	prj
 	 	  | entity

 ==============================================================

 	Comments:
 	1) Developer comments:

 		1.1) single line

 			double balance ; // balance of account

 		1.2) multi line

 			public void doTask() {
 				/*
 					comments
 				*/
 			}

 	2) API comments [ JavaDoc comments]
 		these comments are for API users who don't have access to your source code
 		like: what this class does, what is this method for, what does it take and return

 		/**

 		*/	



 ==================
 
 Constructors
 	==> special methods which has the same name as that of class and gets executed when object is created.
 	==> can't call it explicity
 	==> used to initialize the state

 	compiler creates a default constructor if no constructors are provided

 	public Account() {
 		this.balance = 0.0;	
 	}

================================

Requirement: need to track how many objects are created [ count]

==============================================================================

Object equality: difference between == and equals()

	Account divyaAcc = new Account("SB 500", 200);

	Account rahulAcc = new Account("SB 500", 200);

every class inherits from java.lang.Object class

Object class has methods like equals(), hashCode(), getClass(), toString(), ..

====================

1) new keyword to create object
2) instance varaibles are state of object ==> heap
3) static variables ==> state of class ==> shared by all objects of a class ==> Class data
4) instance methods ==> context is object ==> object.method()
5) static methods ==> context is class ==> ClassName.method()
	within static methods we can't use "this"
6) constructors ==> initialize the state of object
7) object equality [ == vs equals()]

Employee
	empId;
	email;
	firstName;
	lastName;
	hireDate;

	if we compare empId ==> should be good 


	equals() {
			empId == 
			firstName ==
			lastName == 

	}

=========

Object class we have == for equals()

===============================================================================
 
Relationship between objects: 
	1) Generalization and Specialization
	2) Realization
	3) Assoication
	4) Uses A Relationship



	getters ==> getId(), getName(), getPrice(),
	setId(id), setName(String name), 

	=============

	Java Development tools:
		1) Testing 
			1.1) unit testing ==> JUnit, TestNG
			1.2) Mocking API ==> Mockito
			1.3) e2e ==> selenium
		2) Static code analysis
			2.1) Checkstyle ==> Naming conventions; code comments; line spaces;
			2.2) PMD, findBugs, SpotBugs ==> good programming practice
					 function cyclcomatic complexity,
					 copy & paste code
					 unreachable code
					 empty block statements

		3) Maven build tool
		.....
===========================================
1) extends keyword for inhertiance

public class Product { // implicitly extends Object
	
}

public class Mobile extends Product { // IS A
	
}
 
public class Tv extends Product {
	
}

public class SmartTv extends Tv {
	
}

================================================

Not allowed: multiple inheritance

class Mobile extends Product, Toy { // error
	
}

===============================

constructor chaining in inheritance:

public class Product { 											new Mobile(20, "iPhone", "4G");
	public Product() {
		"Prints p1"		
	}

	public Product(int id, String name) {
		"prints p2"
	}
}

public class Mobile extends Product { 
	public Mobile() {
		"prints M1"
	}

	public Mobile(int id, Stirng name, String connectivity) {
			"prints M2";
	}
}

===========


public class Product { 											new Mobile(20, "iPhone", "4G");
	public Product() {
		"Prints p1"		
	}

	public Product(int id, String name) {
		"prints p2"
	}
}

public class Mobile extends Product { 
	public Mobile() {
		"prints M1"
	}

	public Mobile(int id, Stirng name, String connectivity) {
			super(id,name);
			"prints M2";
	}
}
===============================================================

Methods in Inheritance

public class Product { 									Mobile m = new Mobile();
	public int getPrice() {								m.getPrice(); // 500
		return 100;										m.getConnectivity(); // 4G
	}
}


public class Mobile extends Product {					Product p = new Mobile(); // upcasting
	public int getPrice() {								p.getPrice(); // 500 ==> dynamic binding
		return 500;										p.getConnectivity(); // error
	}

	public String getConnectivity() {
		return "4G";
	}
}

 Object o = new Mobile(); // upcasting
=====================================


double d = 10.45;

int x = (int) d; // type casting

int y = 100;

double g = y;

================================

Product, Account; are too generic ==> doesn;t exist in real world

such classes are to be marked as "abstract" ; abstract classes can't be instantiated

abstract methods ==> all inherited classes should compulsorily override them.

===============================

