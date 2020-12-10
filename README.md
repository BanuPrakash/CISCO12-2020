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

package com.cisco.prj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cisco.prj.entity.Product;

public class ProductDaoJdbcImpl implements ProductDao {
 
	@Override
	public List<Product> getProducts() throws DaoException {
		String SQL = "SELECT id, name, price, quantity FROM products";
		List<Product> products = new ArrayList<Product>();
		Connection con = null;
		try {
			con = DBUtil.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(SQL);
			while(rs.next()) {
				products.add(new Product(rs.getInt("id"), 
						rs.getString("name"), rs.getDouble("price"),
						rs.getInt("quantity")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DaoException("unable to get products", e);
		} finally {
			DBUtil.closeConnection(con);
		}
		
		return products;
	}

	@Override
	public void addProduct(Product p) throws DaoException {
		String SQL = "INSERT INTO products (id, name, price, quantity) VALUES (0, ?, ?, ?)";
		Connection con = null;
		try {
			con = DBUtil.getConnection();
			PreparedStatement ps = con.prepareStatement(SQL);
			ps.setString(1, p.getName());
			ps.setDouble(2, p.getPrice());
			ps.setInt(3, p.getQuantity());
			ps.executeUpdate();
		} catch (SQLException e) {
			throw new DaoException("unable to add product", e);
		} finally {
			DBUtil.closeConnection(con);
		}
	}

	@Override
	public Product getProduct(int id) throws DaoException {
		Product p = null;
		String SQL = "SELECT id, name, price, quantity FROM products WHERE id = ?";
		Connection con = null;
		try {
			con = DBUtil.getConnection();
			PreparedStatement ps = con.prepareStatement(SQL);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				p = new Product(rs.getInt("id"), 
						rs.getString("name"), rs.getDouble("price"),
						rs.getInt("quantity"));
			}
		} catch (SQLException e) {
			throw new DaoException("unable to get products", e);
		} finally {
			DBUtil.closeConnection(con);
		}
		return p;
	}

}
=========
package com.cisco.prj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBUtil {
	private static String DRIVER = "";
	private static String URL = "";
	private static String USER = "";
	private static String PWD = "";
	
	static {
		ResourceBundle res = ResourceBundle.getBundle("database");
		DRIVER = res.getString("DRIVER");
		URL = res.getString("URL");
		USER = res.getString("USER");
		PWD = res.getString("PWD");
		
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL,USER, PWD);
	}
	
	public static void closeConnection(Connection con) {
		if( con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
==============
package com.cisco.prj.entity;

 

public class Product {
	private int id;
	private String name;
	private double price;
	private int quantity;
	
	public Product() {
	}
	public Product(int id, String name, double price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
===========
mysql> create database CISCO_2020;  

mysql> use CISCO_2; Database changed mysql> create table products (id int PRIMARY KEY AUTO_INCREMENT, name VARCHAR(100), price double, quantity int);  

mysql> insert into products values (0, 'iPhone 11', 89000.00, 100);  

mysql> insert into products values (0, 'Samsung TV', 129000.00, 100);  

mysql> select * from products; 
==============

===============

Map<Employee, Date> empDetails = ....

Now Employee is a key ; it should contain hashCode() and equals()

Map<Product, String> productSupplier = ....
=========================================================

Java Concurrency ==> Building Multithreaded applications

Process ==> program in execution
a process should hava unit of work ==> Thread

Single threaded application ==> one unit of work running
Notepad, calculator, sublime text

Multithreaded applications
	==> many concurrent units of work execting
	Eclipse, Browser, Word 

	Word: document editing is a thread; spell check; grammer check; auto save
==============

Why do we need Multithread application?
1) Better User experence
	Browser ==> Network thread; Render text; render image ; event loop; 
2) Optimization of available Resources
	one thread => one Core / CPU

	Objects / classes are shared between threads
	==> Threads are lightweight process

	==> each thread has a seperate stack and shares the heap and loaded class

	Document ==> heap

	Main thread, Grammer check and Spell check are using the same document
====================================================================================

Runnable interface

interface Runnable {
	void run();
} 

Thread class:
	Thread control methods:
	a) start()
	b) sleep(long ms)
	c) yield()
	d) join()
	e) interrupt()

	Deprecated methods:
	f) suspend()
	g) resume()
	i) stop()

	Windows/ Mac ==> Preemptive OS
============

Daemon threads ==> helper threads ==> no main logic

class Timer extends Thread {
public void run() {
	while(true) {
		update time
		wait 1 sec
    }
 }
}
================

Day 4
======
Access modifiers; final keyword

Java has the following access modifiers:
1) private
2) public
3) default ==> package private
4) protected

final keyword:
1) to declare a constant

final double PI = 3.14159; // constant

PI = 5; // error

2) final class : ==> won't allow inheritance

final class User {
	
}

class EsteemUser extends User { // error
	
}

3) final methods: can't override

class User {
	
	final public User login(String username, String pwd) {

	}
}


class Manager extends User {
	
	@Override
	public User login(String username, String pwd) { // ERROR

	}
}

4) final reference: constant Pointer

final int[] elems = {4,5,8};

elems[0] = 100; // allows

elems = new int[3]; // error

final Product p = new Product(1,"iPhone11",98000.00);
p.setPrice(56000.00); // allows

p = new Product(2,"Samsung", 45000); // ERROR because pointer constant

===========

Product p = new Product(1,"iPhone11",98000.00);

modifyProduct(p);

void modifyProduct(final Product prd) {
	
}
==================================================

Garbage Collection:

In java we allocate memory for objects using "new" keyword; we don't release the memory

C program:

malloc / calloc to allocate memory

free(ptr) to relase the memory

C++:
new to allocate memory
delete to release the memory
============

Java has Garbage Collector; whose job is to release the unused memory

Unused memory ==> any memory on heap area which doesn't have pointers to it.

Garbage Collector is a System Group low priority thread; when it starts it clears the unreferenced objects
on heap

System.gc(); // request to invoke GC
===============================


Threads:
interface Runnable and Thread class

=========

Thread Safety: => if a member is safe to be used in multi-threaded environment; 


local variables ==> reside on stack ==> each thread seperate stack ==> safe
instance variables ==> on heap ==> shared by all threads ==> not safe
static var ==> class data ==> shared by threads ==> not safe

=================

critical section ==> where data is getting mutated


	since deposit and withdraw are marked as "synchronized"; ==> only if a thread has a mutex/lock/monitor
	then the thread is given a access to either deposit or withdraw

	once the the thread completes the mthod lock is released


public class Utility {
	List<Data> src = new ArrayList<>();
		// pull data from DB and update src

	List<Data> dest = new ArrayList<>();
		// we need to copy 10 elements from src into dest [ pagination]


	public static void copy(List<Data> destination, List<Data> source) {
		synchronized(source) {
			synchronized(destination) {
				implmenent copy mechanism
			}
		}
	}
}

===========================


class Account {
	// heap area lock
	public synchronized void deposit() {

	}
	// heap area lock
	public synchronized void withdraw() {

	}

	// lock on class data
	public synchronized static void payIntrest() {

	}
}

Account a1 = new Account(); // one lock
Account a2 = new Account(); // different lock
but both share class data lock on Account

============================================

Thread Pool:
issue with start() method;
==> creates stack; pushes run() method on stack;
 once complete; stack is destroyed

 ==> latency involved in creating stack and releasing stack

 Solution ==> thread pool
 ==============

 1) add your tasks into your own data container
 2) write a seperate thread which keeps checking the size of container
  if threashold is reached
  push the tasks as submit into pool
===================================================

JDBC ==> Java Database Connectivity ==> integration API to connect to relational database

java --> provides interfaces
database vendors [oracle, microsoft, ..] ===> implementation classes ==> jar files

Steps involved in using JDBC:

1) load database vendor classes

	Class.forName(' database vendor driver class');

2) Establish a database connection
	
	getconnection() is a factory method
	java.sql.Connection con = DriverManager.getConnection(url, username, pwd);

	URL:
		jdbc:mysql://192.123.11.35:3306/employee_db

		getConnection() returns MySQLConnection

		jdbc:oracle:thin:@189.44.22.67:1521:employee_db

		getConnection() returns OracleConnection

3) send SQL statements
	a) Statement
		if SQL is constant / fixed

		"select * from employees"

	b) PreparedStatement
		if SQL accepts IN parameters

		select * from users where username = ? and password = ?

		? ==> IN parameter	

		insert into users values (?,?,?,?);

	methods:
		ResultSet executeQuery(); // for "SELECT statements"

		int executeUpdate(); // for INSERT, DELETE and UPDATE SQL
		// return value is number of rows affected

4) close the connection in finally block		

==========================================

Maven ==> java development tool
	
	Why Maven?
		1) ==> dependency management

		Application ==> first1.3.jar
					But first1.3.jar has dependency on second5.6.jar
					and second5.6.jar has dependency on third1.1.jar

		Transitive dependencies

		2) ==> standard structure for applications
			IDEs  Intellij; Eclipse; NetBeans; ...
			Maven brings a portable project structure

		3) ==> configure goals
			CLEAN ==> COMPILE ==> TESTING ==> BUNDLE ==> DEPLOY

	pom.xml ==> Project Object Model 


<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>5.1.27</version>
</dependency>

 
<dependency>
    <groupId>uber</groupId>
    <artifactId>drivermodule</artifactId>
    <version>2.0.0</version>
</dependency>

<dependency>
    <groupId>uber</groupId>
    <artifactId>paymentmodule</artifactId>
    <version>2.0.0</version>
</dependency>
<dependencies>
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>5.1.27</version>
		</dependency>
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>javax.servlet-api</artifactId>
			<version>3.1.0</version>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>jstl</artifactId>
			<version>1.2</version>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.5.1</version>
				<configuration>
					<source>1.8</source>
					<target>1.8</target>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.eclipse.jetty</groupId>
				<artifactId>jetty-maven-plugin</artifactId>
				<version>9.3.7.v20160115</version>
			</plugin>
			<!-- <plugin>
				<groupId>org.apache.tomcat.maven</groupId>
				<artifactId>tomcat7-maven-plugin</artifactId>
				<version>2.3-SNAPSHOT</version>
			</plugin> -->
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-war-plugin</artifactId>
				<version>2.3</version>
				<configuration>
					<failOnMissingWebXml>false</failOnMissingWebXml>
				</configuration>
			</plugin>
		</plugins>
	</build>


public class DBUtil {
	private static String DRIVER = "";
	private static String URL = "";
	private static String USER = "";
	private static String PWD = "";

	static {
		ResourceBundle res = ResourceBundle.getBundle("database");
		DRIVER = res.getString("DRIVER");
		URL = res.getString("URL");
		USER = res.getString("USER");
		PWD = res.getString("PWD");

		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PWD);
	}

	public static void closeConnection(Connection con) {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

======================================================

Convert "database stand alone" example into "web based application"
=====================================================================

Servlet technology:
	write server side java code to build web application


	GET http://localhost:8080/register
		engine creates "request" and "response"

		Any request from Address BAR, Hyperlink


	POST http://localhost:8080/register
		engine creates "request" and "response"	

		FORM data

	@WebServlet("/register")
	public class RegisterServlet extends HttpServlet {

		public void doGet(HttpServletRequest req, HttpServletResponse res) {
			// code 
		}

		public void doPost(HttpServletRequest req, HttpServletResponse res) {
			// code 
		}
	}
=====================================================

Old version of Servlet API:
public class RegisterServlet extends HttpServlet {

		public void doGet(HttpServletRequest req, HttpServletResponse res) {
			// code 
		}

		public void doPost(HttpServletRequest req, HttpServletResponse res) {
			// code 
		}
	}


web.xml

<servlet>
		<servlet-name>one</servlet-name>
		<servlet-class>RegisterServlet</servlet-class>
</servlet>

<servlet-mapping>
		<servlet-name>one</servlet-name>
		<url-pattern>/register</url-pattern>
</servlet-mapping>

==========

Right click on project ==> Run As ==> Maven build ==>
Goals: jetty:run 


Running on different port

jetty:run -Djetty.http.port=9999

=======================

Spring boot ==> JPA ==> Hibernate





	




	