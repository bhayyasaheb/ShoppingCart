package com.niit.shoppingcart.testcase;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;



public class CategoryTestCase {
	
	

	@Autowired
	private static Category category;
	
	@Autowired
	private static CategoryDAO categoryDAO;

	@Autowired
	private static AnnotationConfigApplicationContext context;
	
	@BeforeClass
	public static void init(){
		
		context = new AnnotationConfigApplicationContext();
		
		context.scan("com.niit");
		
		context.refresh();
		
		//category =  (Category) context.getBean("category");
		
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}
	
	// TEST  Cases to notify it we give @test annotation that test case are here 
	
	
	// To create the table
	
	@Test
	public void createCategoryTestCase(){
		
		category.setId("S502");
		category.setName("new iphone SE ");
		category.setDescription("This is Mobile category");
		
		boolean flag = categoryDAO.save(category);
		assertEquals("updateCategoryTestCase",true,flag);
		// compare what you are excepting Vs what we are getting from save method
	}
	
	// Update table
	
//	@Test
	public void updateCategoryTestCase(){
		
		category.setId("S6363");
		category.setName("new iphone  category");
		category.setDescription("This is mobile category");
		
		boolean flag = categoryDAO.update(category);
		assertEquals("updateCategoryTestCase", true, flag);
	}
	
//	@Test
	public void deleteTestCase(){
		
		boolean flag = categoryDAO.delete("S6363");
		assertEquals("deleteTestCase", true, flag);
	}
	
//	@Test
	public void deleteByCategoryTestCase(){
		
		category.setId("S6363");
		
		boolean flag = categoryDAO.delete(category);
		assertEquals("deleteCategoryByCategoryTestCase", true, flag);
	}
	
	//@Test
	public void getCategoryByIdTestCase(){
		
		category = categoryDAO.getCategoryById("S6363");
		assertEquals("getCategoryByIdTestCase", true, category);
	}
	
	//@Test
	public void getCategoryByNameTestCase(){
		
		categoryDAO.getCategoryByName("new iphone category");
		assertEquals("getCategoryByNameTestCase", true, category);
	}
	
//	@Test 	//it tell the Junit to run this 
	public void getallCategoryTestCase(){
		
		//it check the value of category how many inserted and give the value is stored in size
		
		int size = categoryDAO.list().size(); 
		assertEquals("getallCategoryValuesTestCase", true, size);
		
	}
}











