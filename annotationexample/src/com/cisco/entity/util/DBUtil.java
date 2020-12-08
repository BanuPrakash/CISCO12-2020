package com.cisco.entity.util;

import java.lang.reflect.Method;

import com.cisco.entity.prj.Column;
import com.cisco.entity.prj.Table;

public class DBUtil {
	
	// create table ...
	public static String createStatement(Class<?>  clazz) {
		StringBuilder builder = new StringBuilder();
		Table t = clazz.getAnnotation(Table.class);
		if( t != null) {
			builder.append("create table ");
			builder.append(t.name()); // create table products
			builder.append("(");  // create table products (
			Method[] methods = clazz.getDeclaredMethods();
			for(Method m : methods) {
				if(m.getName().startsWith("get")) {
					Column col = m.getAnnotation(Column.class);
					if(col != null) {
						builder.append(col.name()); // create table products (id 
						builder.append(" ");
						builder.append(col.type()); 
						builder.append(","); // create table products (id NUMERIC(10) , pname VARCHAR(100),
					}
					
				}
			}
			builder.setCharAt(builder.lastIndexOf(","), ')' );
		}
		return builder.toString();
	}
}
