package com.cisco.prj.dao;

import org.springframework.stereotype.Repository;

import com.cisco.prj.entity.Product;

@Repository
public class ProductDaoJpaImpl implements ProductDao {

	@Override
	public void addProduct(Product p) {
		System.out.println("stored in mysql!!!");
	}

}
