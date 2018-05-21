package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Customer;
import com.example.service.CustomerService;

@Controller
//@RequestMapping("/")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String getLogin(ModelMap model) {
		model.addAttribute("greetings", "Customer Application");
		return "login-form";
	}

	@RequestMapping(value = "/homepage", method = RequestMethod.GET)
	public String submitLogin() {
		ModelAndView model1 = new ModelAndView();
		model1.addObject("message", "You are logged in !!");
		return "homepage";
		
	}
	
	@RequestMapping(value = "/addCustomer", method = RequestMethod.GET)
	public ModelAndView getCustomerForm(){
		ModelAndView model = new ModelAndView("addCustomer");
		return model;
	}
	
	
	@RequestMapping(value = "/customerSucess", method = RequestMethod.GET)
	public String customerSucess(ModelMap model) {
		model.addAttribute("message", "Customer data saved successfully !!");
		return "customerSucess";
	}
	
	
	@RequestMapping(value = "/submitaddCustomer", method = RequestMethod.POST)
	public String submitCustomerForm(@ModelAttribute("customer") Customer customer,BindingResult result, ModelMap model ) {
		if(result.hasErrors()) {
			return "addCustomer";
		}
		model.addAttribute("message", "Customer data saved successfully !!");
		return "customerSucess";
	}
	
	@RequestMapping(value = "/getCustomerDetails", method = RequestMethod.POST)
	public ModelAndView getCustomerDetails(@ModelAttribute("customerId") String id, BindingResult result){
		if(result.hasErrors()) {
			ModelAndView model = new ModelAndView("CustomerSearch");
			return model;
		}
		ModelAndView model = new ModelAndView("showCustomerDetails");
		Customer customer = customerService.findById(Long.parseLong(id));
		model.addObject("customerDetails", customer);
		return model;
	}
	
	/*@RequestMapping(value = "/showCustomerDetails")
	public String customerDetails() {
		return "showCustomerDetails";
	}*/
	
	@RequestMapping(value = "/Customer", method = RequestMethod.GET)
    public ModelAndView listAllUsers() {
		ModelAndView model = new ModelAndView("diplayCustomers");
		List<Customer> customers = customerService.findAllCustomers();
		model.addObject("allCustomers", customers);
		return model;
	}
	
	@RequestMapping(value = "/CustomerSearch", method = RequestMethod.GET)
	public String customerSearch() {
		return "CustomerSearch";
	}
		
	
	
}
