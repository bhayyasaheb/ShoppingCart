package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class CategoryTest {

	public static void main(String[] args) {
		
		//you have get context 
		// ask context to get bean i.e.category

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();

		context.scan("com.niit"); // it will create all component

		context.refresh();

		// whatever beans/ instances required you ask context
		
		context.getBean("category"); // allows follow the proper convention
										// it will create object of the class
		System.out.println("Category instance is created");
		
	}
}
