package com.example.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
/*@Entity
@Table(name = "customer")*/
public class Customer {

	/*@Id
	@GeneratedValue
	@Column(name = "customer_id")*/
	private long id;
	
	//@Column(name = "cust_name")
	private String firstName;

	//@Column(name = "cust_phone")
	private int phone;

	//@Embedded
	private Address address;
	
	//@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<Order> order;
	
	public Customer() {
		
	}

	public Customer(int id,String firstName, int phone) {
		this.id = id;
		this.firstName = firstName;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return " Customer("+ id + "," + firstName + "," + phone +")"; 
	}

}
