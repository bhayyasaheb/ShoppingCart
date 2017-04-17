package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Category;

public interface CategoryDAO  {

	// declare method related CRUD operation
	// access_specifier return_type method_name(parameter_list) throws
	// exception_list

	// get all categories

	public List<Category> list();

	// create category

	public boolean save(Category category);

	// update category

	public boolean update(Category category);

	// delete category by id

	public boolean delete(String id);

	// delete category by category

	public boolean delete(Category category);

	// get category by id

	public Category getCategoryById(String id);

	// get category by name

	public Category getCategoryByName(String name);

}
