package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Customer;
import com.example.service.CustomerService;

@Controller
public class controller {
	
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getLogin() {
		ModelAndView model2 = new ModelAndView("login");
		return model2;
	}
	

	@RequestMapping(value = "/homepage", method = RequestMethod.POST)
	public ModelAndView submitLogin() {
		ModelAndView model1 = new ModelAndView();
		model1.addObject("message", "You are logged in !!");
		return model1;
		
	}
	
	/*@RequestMapping(value = "/listUsers", method = RequestMethod.GET)
    public ModelAndView listUsers() {
        ModelAndView modelAndView = new ModelAndView("UserList");
        modelAndView.addObject("users", customerDao.showAllCustomers());
        return modelAndView;
    }*/
	
	
	@RequestMapping(value = "/addCustomer", method = RequestMethod.GET)
	public ModelAndView getCustomerForm(){
		ModelAndView model = new ModelAndView("addCustomer");
		return model;
	}
	
	@RequestMapping(value = "/submitaddCustomer", method = RequestMethod.POST)
	public ModelAndView submitCustomerForm(@ModelAttribute("customer") Customer customer, BindingResult result) {
		if(result.hasErrors()) {
			ModelAndView model = new ModelAndView("addCustomer");
			return model;
		}
		ModelAndView model = new ModelAndView("addCustomerSucess");
		model.addObject("message", "Details submitted successfully");
		return model;
	}
	
	@RequestMapping(value = "/CustomerSearch/{id}", method = RequestMethod.GET)
	public ModelAndView getCustomerDetails(@ModelAttribute("id") int id, BindingResult result){
		if(result.hasErrors()) {
			ModelAndView model = new ModelAndView("CustomerSearch");
			return model;
		}
		ModelAndView model = new ModelAndView("showCustomerDetails");
		
		model.addObject("message", "Customer Details");
		return model;
	}
	
	
	
}
