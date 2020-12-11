package com.cisco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cisco.prj.entity.Product;
import com.cisco.prj.service.OrderService;

@SpringBootApplication
public class OrderappApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(OrderappApplication.class, args);
		
		OrderService os = ctx.getBean("orderService", OrderService.class);
		
		Product p = new Product();
		os.insertProduct(p);
	}

}
