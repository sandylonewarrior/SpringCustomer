package com.example.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;
import com.example.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class ControllerRest {
	final static Logger logger = Logger.getLogger(ControllerRest.class);
	
	
	
	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = { "/loadCustomers", "" }, method = RequestMethod.GET)
	public ResponseEntity<?> getCustomers() {
		System.out.println("rest controller is called");
		logger.debug("getCustomers method called");
		List<Customer> customers = customerService.findAllCustomers();
		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
	}

	@RequestMapping(value = { "/registerCustomer", "" }, method = RequestMethod.POST)
	public ResponseEntity<Customer> registerCustomer(@RequestBody Customer customer) {
		logger.debug("registerCustomer method called");
		customerService.saveCustomer(customer);
		return new ResponseEntity<Customer>(customer, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{customerId}", method = RequestMethod.GET)
	public ResponseEntity<Customer> loadCustomer(@PathVariable String customerId) {
		logger.debug("loadCustomer method called with customerId: " + customerId);
		Customer customer = customerService.findById(Long.parseLong(customerId));
		return new ResponseEntity<>(customer, HttpStatus.OK);
	}

	@RequestMapping(value = "/{customerId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteCustomer(@PathVariable String customerId) {
        logger.debug("deleteCustomer method called");
        boolean deleted = customerService.deleteCustomerById(Long.parseLong(customerId));
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
        
	}
}
