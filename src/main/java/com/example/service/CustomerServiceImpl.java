package com.example.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import com.example.model.Customer;
 

 
@Service("customerService")
//@Transactional
public class CustomerServiceImpl implements CustomerService{
     
    private static final AtomicLong counter = new AtomicLong();
     
    private static List<Customer> customers;
     
    static{
        customers= populateDummyCustomers();
    }
 
    @Override
	public List<Customer> findAllCustomers() {
        return customers;
    }
     
    @Override
	public Customer findById(long id) {
        for(Customer customer : customers){
            if(customer.getId() == id){
                return customer;
            }
        }
        return null;
    }
     
    @Override
	public Customer findByName(String name) {
        for(Customer customer : customers){
            if(customer.getFirstName().equalsIgnoreCase(name)){
                return customer;
            }
        }
        return null;
    }
     
    @Override
	public void saveCustomer(Customer customer) {
        customer.setId(counter.incrementAndGet());
        customers.add(customer);
    }
 
    @Override
	public void updateCustomer(Customer customer) {
        int index = customers.indexOf(customer);
        customers.set(index, customer);
    }
 
    @Override
	public boolean deleteCustomerById(long id) {
         
        for (Iterator<Customer> iterator = customers.iterator(); iterator.hasNext(); ) {
            Customer customer = iterator.next();
            if (customer.getId() == id) {
                iterator.remove();
            }
        }
        return true;
    }
 
    @Override
	public boolean isCustomerExist(Customer customer) {
        return findByName(customer.getFirstName())!=null;
    }
 
    private static List<Customer> populateDummyCustomers(){
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1,"Sam",302123789));
        customers.add(new Customer(2,"Tom",405214520));
        customers.add(new Customer(3,"Jerome",45141451));
        customers.add(new Customer(4,"Silvia",501524524));
        return customers;
    }
 
    @Override
	public void deleteAllCustomers() {
        customers.clear();
    }
 
}