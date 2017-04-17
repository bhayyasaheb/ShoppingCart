package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Product;

public interface ProductDAO {

	// declare method related CRUD operation
	// access_specifier return_type method_name(parameter_list) throws
	// exception_list

	// get all Product
	
	public List<Product> list();

	// create category

	public boolean save(Product product);

	// update category

	public boolean update(Product product);

	// delete category by id

	public boolean delete(String id);

	// delete category by category

	public boolean delete(Product product);

	// get product by id

	public Product getProductById(String id);

	// get product by name;

	public Product getProductByName(String name);

}
