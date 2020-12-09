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
    class Test {

    }
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
 

 public class MicroWave extends Product {

 	isExpensive() {

 }
}

public class WashingMachine extends product {
	isExpensive() {

 }
}

	Product[] products = new Product[500]; // Array of 5 Pointers
		products[0] = new Tv(133, "Sony Bravia", 135000.00, "LED"); // upcasting
		products[1] = new Mobile(453, "MotoG", 12999.00, "4G");
		products[2] = new MicroWave(634, "Onida Thunder", 3500.00, "CRT");
		products[3] = new Mobile(621, "iPhone XR", 99999.00, "4G");
		products[4] = new WashingMachine(844, "Oppo", 9999.00, "4G");
	

===============

code without upcasting:

Tv tvs = new Tv[1000];
Mobile mobiles = new Mobile[5000];
WashingMachine wms = new WashingMachine[100];

for expensive:

for(Tv t : tvs) {
	if(t.isExpensive()) {
		..
	}
}

for(Mobiles m : mobiles) {
	if(m.isExpensive()) {
		..
	}
}

for(WashingMachine m : wms) {
	if(m.isExpensive()) {
		..
	}
}

===========================

Day 2:
======
https://github.com/BanuPrakash/CISCO12-2020

Recap:
1) JRE , JVM
2) OOP with Java 
[ class , object, instance var, static variables, static and instance methods, constructors]
== vs equals()
toString()
3) packages
4) logically group classes 
5) Generalization and Specialization relationship ==> inheritance
 	extends
 	abstract class and abstract methods
 	override concepts
 	SOLID design priciple ==> OCP ==> open for extension; close for a change
 	Reflection API ==> invoke methods

==============
Realization relationship

A component/object will realize the behaviour specified by other in order to communicate.

Realization ==> following a contract

In Java we interface type for realization relationship

	interface interfaceType {
		abstract methods
		constants
	}

	can't have state and behaviour defintions.


	interface ProductDao {
		void addProduct(Product p);
		Product getProduct(int id);
	}

	by default all methods in interface are abstract and public

	public abstract void addProduct(Product p);

	// ProductDaoMySQLImpl realizes the ProductDao behaviour
	public class ProductDaoMySQLImpl implements ProductDao {
		// code 
		// instance var

		public void addProduct(Product p) {
			SQL statements
		}
		public Product getProduct(int id) {

		}
	}

	public class ProductDaoMongoDbImpl implements ProductDao {
		// code 
		// instance var

		public void addProduct(Product p) {
			Monogodb methods
		}
		public Product getProduct(int id) {

		}
	}

	===============

	Why Program to interface?
		1) Loose coupling
		2) DESIGN
		3) IMPLEMENTATION
		4) TESTING
		5) INTEGRATION

==============================

	download interfaceexample.zip ==> extract
	Good part: loose coupling; switching between different strategies

	issues with existing code using interface:
		==> client code is getting changed [ clients are hetergenous; many clients; deployed across the globe]
		==> implmentation is exposed to client

	============

	Configuration files 
	==================

	dbconfig.properties
	DAO=MYSQL


	public class EmployeeDaoFactory {

	// NOT OCP
	public static EmployeeDao getEmployeeDao() {
		will read dbconfig
		let config be value read from "DAO" key in properites file
		if(config.equals("MYSQL")) {
			return new EmployeeDaoMySQLImpl();
		} else if (config.equals("MONGO")) {
			return new EmployeeDaoMongimpl();
		}
	}
}

========

	Creating objects using Reflection API

	1) How objects are created?
		if class name is known
		new ClassName();

	2) If class is not know how to create a object
		dbconfig.properties
		DAO=com.cisco.prj.dao.EmployeeDaoMongoImpl


		String str = read from "DAO" property of dbconfig.properties

		now we have str = "com.cisco.prj.dao.EmployeeDaoMongoImpl";

		Class.forName(str);

		Classloader loads a class


		Class.forName(str).newInstance();

		===========

		str = "java.lang.String";

		Class.forName(str).newInstance(); // creates a String object

		str = "java.util.Date"
		Class.forName(str).newInstance(); // creates a Date object


		=======
 		// static block
		static {
			code gets execueted only once as soon as class is loaded
		}

================

 interfaces for OCP

 	to perfom operations like sort, max, min we need to have comparable objects

 	interface Comparable {
 		int compareTo(Object obj);
 	}

 	class Names implements Comparable {

 		public int compareTo(Object obj) {
 			length; lexical
 		}
 }

Names[] = {George Brad Angelina Chris Lee}

// OCP
 void sort(Comparable[] elems) {
 	i loop
 	j loop i + 1
 		if( elems[i].compareTo(elems[j]) > 0 )
 			swap logic
}


class Rectangle implements Comparable {
	
	public int compareTo(Object obj) {
 			return area diff
 		}
}
==================================================

interface Swim { void swim(); } 
interface Dance { void dance(); }
interface Fight { void fight(); }

// actor is capable of dancing
class Actor implements Dance {
		public void dance() {
			//
		}
}
// hero is a Actor; he can dance
// he is also capable to fight and swim
class Hero extends Actor implements Fight, Swim {
		public void fight() {}
		public void swim() {}
}

Fight f = new Actor(); // error
Fight f = new Hero(); // valid or not
f.fight(); // works
f.dance(); // ? error

Dance d = (Dance) f;
d.dance(); // works
======================================
	
	CustomerInterface {
			login()
			getBalance()
			transfer()
	}

	ManagerInterface {
		createAccount()
		viewTodaysTransaction();
		..
		lockAccount()
	}

class BankingApplication implements CustomerInterface, ManagerInterface {
			login()
			getBalance()
			transfer()
			createAccount()
		viewTodaysTransaction();
		..
		lockAccount()
}
========================


Anonymous class : class without name

interface Flyable {
	void fly();
}

class Bird implements Flyable {
	// state; name; weight; life
	// behaviour ; eat; makeSound();

	public void fly() {

	}
}

class AeroPlane implements Flyable {
		// state and behaviour
		public void fly() {

		}
}

Flyable f= new Bird(); Flyable f = new AeroPlane(); 

Flyable f = new Flyable(); // error

// AVOID
class Dummy implements Flyable {
	public void fly() { ... }
}


Flyable f = new Flyable() {
	public void fly() {
		jump from 10th floor
   }	
};

public void transport(Flyable f) {
	f.fly();
}
=========

java 8 introduced lambda expression ==> shorter form for anonymous class

Functional interface: interface which has only one method to implement

Lambda expressions can be used only on Functionalinterface
=================================================

Generic Types 

class Rectangle {
	private int width;
	private int breadth;
	..
}


class DRectangle {
	private double width;
	private double breadth;
	...
}

==================

class Rectangle <T> {
	private T width;
	private T breadth;
	..
}

Rectangle<Integer> r1 = new Rectangle<Integer>(4,5);

Rectangle<Double> r2 = new Rectangle<Double>(1.4,5.6);

Rectangle<String> r3 = new Rectangle<String>("a","b");

Generics limitation : can't be used on primitive type
Integer is a type wrapper for int
Double is a type wrapper for double

=========

 class Rectangle <T1, T2> {
	private T1 width;
	private T2 breadth;
	..
}

Rectangle<Integer, Double> r1 = new Rectangle<Integer, Double>(4,6.5);

===========================================

Unit testing in java

Frameworks ==> JUnit; TestNG

Along with your code parallely you should write test code
==========
	Exception Handling

	Any abnormal condition that arises during program execution is a exception.
	Exception object contains the following information:
		1) What went wrong?
		2) Why did it go wrong?
		3) Where?

 	
 	Error type of exceptions can't be handled in application;
 	system is going to crash; fix and re-run

 	Exception type of exceptions we can handle [ alternate flow]


ArithmeticException is unchecked exception:

public class First {

	public static void main(String[] args) {
		System.out.println("Hello");
			doTask();
		System.out.println("End!!");
	}

	private static void doTask() {
		int x = 10;
		int y  = 0;
		
		int res = x /y;
		System.out.println(res);
	}

}

Unchecked Exceptions needs to be handled using try-catch syntax

try {
	// actual code
} catch(TypeOfException1 ex) {
	
} catch(TypeOfException2 ex) {
	
}




Recommended way to handle unchecked exceptions:
private static void doTask() {
		int x = 10;
		int y  = 0;
		if(y != 0) {		
			int res = x /y;
			System.out.println(res);
	    }
	}


==

public static void main(String[] args) {	
		Employee emp = new Employe(,,,);
		 EmployeeDao empDao = EmployeeDaoFactory.getEmployeeDao();
		 if( empDao != null) {
		 empDao.addEmployee(emp);
		}
	}

Avoid:
public static void main(String[] args) {	
		Employee emp = new Employe(,,,);
		 EmployeeDao empDao = EmployeeDaoFactory.getEmployeeDao();
		 try {
		 	empDao.addEmployee(emp);
		  } catch(NullPointerException ex) {
		  		ex.preintStackTrace();
		 	}
		}
	}
======================

finally block; compulsory excecute block; 
exception occurs or not this block executs

Release of resources should be done in finally

try {
		open file
		open db connection
		read from a file
		store into database
	
} catch(SQLException ex) {
	// exception handling code
} catch(IOException ex) {
	// exception handling code
} finally {
	close file
	close dbconnection
}
=========================

Annotation:
	==> metadata [ data about data]

Metadata can be in the form of XML or annotation

@Override 
@Test

Things we need to know about annotation:
1) Who uses it?
	COMPILER
	CLASSLOADER
	JRE
2) Where can i apply?
	TYPE [ class , interface , annoations]
	METHOD 
	FIELD
	CONSTRUCTOR

	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.SOURCE)
	public @interface Override {
	}

	=======================

	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.CLASS)
	public @interface Mobile {
		String make();
	}

	@Mobile(make="Samsung")
	public class Pubg extends Game {

	}
==========


@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.METHOD})
public  @interface Test {
}
=================

lets create 2 annoations 
1) Table
2) Column

Annotations has only properties and not variables and methods

@Retention(RUNTIME)
@Target(TYPE)
public @interface Table {
	String name();
}

name="products" <======== setting name

x = name() <========= getting name



@Column(name="pname")

===========

never concat a string to create a new String

String s = "Hello";

s += "World";

s += "123";

s += "Bye";
============================
package com.cisco.prj.entity;

public class Product implements Comparable<Product> {
	private int id;
	private String name;
	private double price;
	private String category;

	public Product() {
	}

	public Product(int id, String name, double price, String category) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public int compareTo(Product o) {
		return this.id - o.id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
===========
List<Product> products = new ArrayList<>();
		products.add(new Product(645, "Hp Laptop", 135000.00, "computer"));
		products.add(new Product(224, "iPhone", 98000.00, "mobile"));
		products.add(new Product(834, "Logitech Mouse", 600.00, "computer"));
		products.add(new Product(5, "Sony Bravia", 125000.00, "tv"));
		products.add(new Product(912, "One Plus", 32000.00, "mobile"));
		products.add(new Product(88, "HP Printer", 19000.00, "computer"));
//		products.add(new Product(834, "Logitech Mouse", 600.00, "computer"));
=============

Product[] products = new Product[6];
		products[0] = new Product(645, "Hp Laptop", 135000.00, "computer");
		products[1] = new Product(224, "iPhone", 98000.00, "mobile");
		products[2] = new Product(834, "Logitech Mouse", 600.00, "computer");
		products[3] = new Product(5, "Sony Bravia", 125000.00, "tv");
		products[4] = new Product(912, "One Plus", 32000.00, "mobile");
		products[5] = new Product(88, "HP Printer", 19000.00, "computer");

==========

package com.cisco.prj.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MovieExample {

	public static void main(String[] args) {
		BufferedReader breader = null;
		try {
			Path path = Paths.get("src/", "movies.csv");
			breader = Files.newBufferedReader(path, StandardCharsets.ISO_8859_1);

		} catch (IOException exception) {
			System.out.println("Error occured while trying to read the file");
			System.exit(0);
		}

//	    breader.lines().collect(Collectors.toList());

		// To get the list of all movie names
		List<String> movies = breader.lines()
				.skip(1)
				.map(line -> Arrays.asList(line.split(";")).get(0))
				.collect(Collectors.toList());

		System.out.println(movies);

		breader = null;
		try {
			Path path = Paths.get("src/", "movies.csv");
			breader = Files.newBufferedReader(path, StandardCharsets.ISO_8859_1);

		} catch (IOException exception) {
			System.out.println("Error occured while trying to read the file");
			System.exit(0);
		}

		
		// A Beautiful Mind Director
		breader.lines() 
			.skip(1)
			.map(line -> Arrays.asList(line.split(";")))
			.filter(movie -> {
				String movieName = movie.get(0);
				return movieName.trim().equalsIgnoreCase("A Beautiful Mind");
			}).forEach(movie -> {
				String director = movie.get(2);
				System.out.println("A Beautiful Mind was directed by " + director);
		});

		breader = null;
		try {
			Path path = Paths.get("src/", "movies.csv");
			breader = Files.newBufferedReader(path, StandardCharsets.ISO_8859_1);

		} catch (IOException exception) {
			System.out.println("Error occured while trying to read the file");
			System.exit(0);
		}

		
		// Top 5 movies voted on IMDB
		breader.lines()
			.skip(1)
			.map(line -> Arrays.asList(line.split(";")))
			.filter(movie -> {
				String imdbVotes = movie.get(9).trim();
				return !imdbVotes.equals("");
			})
			.sorted((movie1, movie2) -> {
				String m1Votes = movie1.get(9).trim();
				String m2Votes = movie2.get(9).trim();
				return Integer.valueOf(m2Votes).compareTo(Integer.valueOf(m1Votes));
			})
			.limit(5)
			.forEach(movie -> {
				System.out.println(movie.get(0) + " --- " + movie.get(9));
			});

	}

}

=========

Day 3:
-------------
	Recap: OOP, Inheritance and Realization relationship [ interface and implements]
	Exception Handling and Annotations

	overriding is for instance methods [ Dynamic binding based on actual instance pointed to]
	Product p = new Mobile(...);
	p.isExpensive(); // invokes method of Mobile and not of Product

	Shadowing: [ Reference]
	public class Base {
		public static void doTask() {
			System.out.println("one");
		}
	}

	public class Derived extends Base {
		// shadowing
		public static void doTask() {
			System.out.println("second");
		}
	}


	Base.doTask(); // one

	Derived.doTask(); // second
================

Java Collection Framework [ containers / data structures]

Array should be the first choice as data containers

int[] elems = new int[100];

Product[] products = new Product[10];

--> Prefer arrays if size is known
--> Prefer this is add/remove happens at last position

-------------

Issues with array:
1) size is fixed
	Product[] products = new Product[10];
2) adding and removing from arbitrary position is difficult
3) needs contiguous memory

-----------

Java Collection Framework provides different data containers.

JCF provides interfaces, implementation classes and algorithm classes [sort, binearySearch, max, min]

few implmentation classes are provided by JCf; but you can choose from 3rd party implmentation


JCFinterface ===> Apache Collection; vavr.io
--------------

interface Iterator<T> {
	boolean hasNext();
	T next();
	T remove();
}
-------

Comparable and Comparator are used to compare objects to perform operations like sort(), max, min(), ...

Comparable  ==> logic is a part of class [ String, Product ==> compareTo()]; only one logic; default

Comparator ==> logic is a part of client code

String[] names = {George Brad Angelina Chris Lee};

Default sort : Anglina, Brad, Chris, George, ...

Client needs to sort by length: Lee, Brad, Chris, George, Angelina
------------------------------------------------


Always use Comparable to compare unique attributes of object like Primary Key

=================================

List:
 	1) supports duplicate elements
 	2) supports index based operations
 		get(10);
 		remove(15);
 		add("this", 5)
 	3) ordered
 	4) re-order [ sort, shuffle, reverse]

Set:
	1) unique collection
	2) doesn't support index operations
	3) not ordered and can't re-order

Vector ==> Legacy ==> very slow ==> code has locking mechanism ==> to avoid data corruption in multithreaded application

In Java Collection Framework ==> Data Containers are interoperble 
[ stack <--> Queue; LinkedList <--> ArrayList]
=================================================================

ArrayList list = new ArrayList();

LinkedList list = new LinkedList();

List list = new ArrayList(); // better than prev 2

list = new LinkedList();

==========

List list = new ArrayList();  // AVOID this
list.add("A");
list.add(new Product());
list.add(new Employee());

for(int i = 0; i < list.size(); i++) {
	if(list.get(i) instanceof String) {
		String s = (String) list.get(i);
	} else if (list.get(i) instanceof Product) {
		Product p = (Product) list.get(i);
	} 

	..
}
-----

List<String> list = new ArrayList<String>(); // generic collection
list.add("A"); // allows
list.add(new Product()); // compilation error

for(int i = 0; i < list.size(); i++) {
	String s = list.get(i);
}
-----------------------------------

Java 8 streams and High Order Functions
---------------------------------------

high order functions are functions which 
	1) accept other functions as arguments
	2) returns a function

	==> treat functions as first class members similar to primitive and object

	Commonly used HOF:
		1) filter
			get sub set based on predicate
		2) map
			to transform data
		3) reduce
			to get aggregate [ sum, count, max, min, avg]
			==> returns a single value [ int or double]
		4) forEach
		5) limit
		6) skip
		7) flatMap
		....


Object oriented programming:
 --> we have methods tightly coupled to state of object
 Account: deposit(amt) ==> we used balance

functional style of programming:
	--> functions are not coupled to any particural type of objects

Java 8 introduced streams ==> channel along which data flows
HOF can be used only on streams [ stream can be from collections, Sockets, File, Database]

Terminal Operations: forEach, reduce, collect
Intermediary Operations: filter, map, skip, limit, flatMap

Stream<T> filter(Predicate<T> predicate);

boolean test(T t);
p -> p.getCategory().equals("computer")

==========

get the names of mobiles
forEach(..); iPhone and One Plus

=================

Arrays are covariant; Generic collections are not covariant

Object[] elems = new String[3]; // works fine

if we pass Mobile as T type
? super T can be Mobile, Product or Object

List<? super T> dest;

==========

T is of Type Product

? extends T ; Product, Mobile or Tv



List<? extends Comparable> list ; this list can point to any collection which contains objects implmenting Comparable

======================================

Set ==> unique collection

HashSet ==> uses hashCode() and equals() to identify duplicate elements
=======
HashCode ==> 
1) 2 similar objects same hashcode;
2) posibility is 2 different objects can also have same hash code



class Rectangle {
	width and breadth;

	@Override
	public int hashCode() {
		return width * breadth;
	}
}

Rectangle r1 = new Rectangle(3,4); // 12
Rectangle r2 = new Rectangle(3,4); // 12

Rectangle r3 = new Rectangle(12,1); // 12
Rectangle r4 = new Rectangle(1,12); // 12
Rectangle r5 = new Rectangle(4,3); // 12
Rectangle r6 = new Rectangle(6,2); // 12

=================================

Primary Key should be good enough

firstName, lastName , middleName
==============================================

TreeSet is a SortedSet and uses Comparable or Comparator to identify duplicates

=================

Map data containers supports storing of data in key/value pairs
Dictionary; DNS Server; read from config file and store in memory

key ==> unique
values -> duplicate support

===========

Map<Employee, Date> empDetails = ....

Now Employee is a key ; it should contain hashCode() and equals()

Map<Product, String> productSupplier = ....

=========================================================

