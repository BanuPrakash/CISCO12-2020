package com.cisco.prj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cisco.prj.dao.CustomerDao;
import com.cisco.prj.dao.OrderDao;
import com.cisco.prj.dao.ProductDao;
import com.cisco.prj.entity.Customer;
import com.cisco.prj.entity.Order;
import com.cisco.prj.entity.Product;

@Service
public class OrderService {
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private OrderDao orderDao;
	
	public Order placeOrder(Order o) {
		return orderDao.save(o);
	}
	
	public List<Order> getOrders() {
		return orderDao.findAll();
	}
	
	public Product getProduct(int id) {
		return productDao.findById(id).get();
	}
	public Product addProduct(Product p) {
		return productDao.save(p);
	}
	
	public List<Product> getProducts() {
		return productDao.findAll();
	}
	
	public Customer addCustomer(Customer c) {
		return customerDao.save(c);
	}
	
	public List<Customer> getCustomers() {
		return customerDao.findAll();
	}
}



