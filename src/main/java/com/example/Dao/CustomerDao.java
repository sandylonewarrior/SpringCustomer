/*package com.example.Dao;

import org.hibernate.SessionFactory;

import com.example.Util.CustomerUtil;
import com.example.model.Customer;


public class CustomerDao {

	SessionFactory sf;
	
	public CustomerDao() {
		sf = CustomerUtil.getSessionFactory();
	}

	public boolean addCustomer(Customer customer) {
		
		Session session = sf.openSession();
		session.getTransaction().begin();
		session.save(customer);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	public boolean deleteCustomer(int customerId) {
		sf = CustomerUtil.getSessionFactory();
		Session session = sf.openSession();
        session.beginTransaction();
        Customer customer = (Customer) session.load(Customer.class, customerId);
        session.delete(customer);
        session.getTransaction().commit();
        session.close();
		return true;
	}

	public boolean updateCustomer(Customer customer) {
		sf = CustomerUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(customer);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	public boolean loadCustomer(int customerId) {
		sf = CustomerUtil.getSessionFactory();
		Session session = sf.openSession();
		session.getTransaction().begin();
		Customer ss = (Customer) session.get(Customer.class, customerId);
		return true;
	}
	
	public boolean showAllCustomers() {
		sf = CustomerUtil.getSessionFactory();
		Session session = sf.openSession();
		session.getTransaction().begin();
		Customer ss = (Customer) session.createCriteria(Customer.class).list();
		return true;
	}
}
*/