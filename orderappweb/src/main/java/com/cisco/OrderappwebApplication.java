package com.cisco;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cisco.prj.entity.Product;
import com.cisco.prj.service.OrderService;

@SpringBootApplication
public class OrderappwebApplication implements CommandLineRunner {
	@Autowired
	private OrderService os;
	
	public static void main(String[] args) {
		SpringApplication.run(OrderappwebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Product> products = os.getProducts();
		for(Product p : products) {
			System.out.println(p.getName() + "," + p.getPrice());
		}
	}

}
