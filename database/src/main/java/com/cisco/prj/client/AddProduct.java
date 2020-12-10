package com.cisco.prj.client;

import com.cisco.prj.dao.DaoException;
import com.cisco.prj.dao.ProductDao;
import com.cisco.prj.dao.ProductDaoJdbcImpl;
import com.cisco.prj.entity.Product;

public class AddProduct {

	public static void main(String[] args) {
		ProductDao productDao = new ProductDaoJdbcImpl();

		try {
			 Product p = new Product(0,"Rbk shoe", 4500.00, 100);
			 productDao.addProduct(p);
			 System.out.println("product added!!!");
		} catch (DaoException e) {
			e.printStackTrace(); // development stage
			
//			System.out.println(e.getMessage()); // production stage
		}
	}

}
