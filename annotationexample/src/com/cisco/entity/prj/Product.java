package com.cisco.entity.prj;

@Table(name="products")
public class Product {
	private int id;
	private String name;
	private double price;

	public Product() {
	}

	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Column(name="id", type="NUMERIC(10)")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="pname")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="amount", type="NUMERIC(12,2)")
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
