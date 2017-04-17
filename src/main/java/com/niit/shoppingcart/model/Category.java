package com.niit.shoppingcart.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Component					// if want create instance of Category-category
@Table(name="Category")		// if the class name and table name different
@Entity
public class Category implements Serializable  {
	
	//add simple properties same as Category table
	//generate getter and setter method
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	@Column(name="name")
	@Size(min=2, max=15, message="please take the name between {min} to {max}") // if the filed name and property
	private String name;
	
	@NotEmpty
	private String description;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
	

}
