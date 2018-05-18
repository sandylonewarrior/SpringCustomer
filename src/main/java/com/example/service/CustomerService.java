package com.example.service;

import java.util.List;

import com.example.model.Customer;

public interface CustomerService {

	List<Customer> findAllCustomers();

	Customer findById(long id);

	Customer findByName(String name);

	void saveCustomer(Customer customer);

	void updateCustomer(Customer customer);

	void deleteCustomerById(long id);

	boolean isCustomerExist(Customer customer);

	void deleteAllCustomers();

}