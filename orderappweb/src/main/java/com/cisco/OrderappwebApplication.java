package com.cisco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cisco.prj.entity.Customer;
import com.cisco.prj.entity.LineItem;
import com.cisco.prj.entity.Order;
import com.cisco.prj.entity.Product;
import com.cisco.prj.service.OrderService;

@SpringBootApplication
public class OrderappwebApplication implements CommandLineRunner {
//	@Autowired
//	private OrderService os;
//	
	public static void main(String[] args) {
		SpringApplication.run(OrderappwebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		List<Product> products = os.getProducts();
//		for(Product p : products) {
//			System.out.println(p.getName() + "," + p.getPrice());
//		}
		
//		Customer c = new Customer();
//		c.setEmail("b@cisco.com");
//		
//		Product p1 =  os.getProduct(3);
//		
//		Product p2 =  os.getProduct(2);
//		
//		LineItem i1 = new LineItem();
//		i1.setProduct(p1);
//		i1.setQty(2);
//		i1.setAmount((p1.getPrice() * 2));
//		
//		LineItem i2 = new LineItem();
//		i2.setProduct(p2);
//		i2.setQty(1);
//		i2.setAmount(p2.getPrice());
//		
//		Order order = new Order(); // orderDate
//		order.setCustomer(c);
//		order.getItems().add(i1);
//		order.getItems().add(i2);
//		order.setTotal(i1.getAmount() + i2.getAmount());
//		
//		os.placeOrder(order);
	}

}
