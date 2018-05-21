package com.example.model;

import java.time.LocalDate;

/*@Data
@Entity(name = "Product")*/
public class Product{
	
	/*@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_Code")*/
	private int productCode;
	//@Column(name = "product_Name")
	private String productName;
	//@Column(name = "product_Vendor")
	private String productVendor;
	//@Column(name = "Description")
	private String Description;
	//@Column(name = "priceEach")
	private int priceEach;
	//@Column(name = "order_Date")
	private LocalDate orderDate;
	/*@ManyToOne
	@JoinColumn(name = "order_Number")*/
	private Order order;
	
	public Product() {
		
	}
	
	public Product(String productName, String productVendor, String Description, int priceEach) {
		this.productName = productName;
		this.productVendor = productVendor;
		this.Description = Description;
		this.priceEach = priceEach;
		}
	
	
	
	

}
