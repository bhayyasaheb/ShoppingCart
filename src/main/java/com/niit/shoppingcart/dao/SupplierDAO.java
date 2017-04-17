package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Supplier;

public interface SupplierDAO {
	
	public List<Supplier> list();

	public boolean save(Supplier supplier);
	
	public boolean update(Supplier supplier);
	
	// delete supplier by id
	
	public boolean delete(String id);
	
	public boolean delete(Supplier supplier);
	
	public Supplier getSupplierById(String id);
	
	public Supplier getSupplierByName(String name);
}
