package com.niit.shoppingcart.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Product;

@Transactional
@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public ProductDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	private Session getSession() {

		return (Session) sessionFactory.getCurrentSession();
	}

	public List<Product> list() {

		return getSession().createQuery("from Product").list();
	}

	public boolean save(Product product) {

		try {
			getSession().saveOrUpdate(product);
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean update(Product product) {

		try {
			getSession().update(product);
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(String id) {

		try {

			sessionFactory.getCurrentSession().delete(getProductById(id));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(Product product) {

		try {
			getSession().delete(product);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Product getProductById(String id) {

		return (Product) getSession().createQuery("from table where id= '" + id + "'").uniqueResult();
	}

	public Product getProductByName(String name) {

		return (Product) getSession().createQuery("from table where name='" + name + "'").uniqueResult();
	}

}
