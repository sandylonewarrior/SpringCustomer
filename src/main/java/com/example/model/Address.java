package com.example.model;

/*@Data
@Embeddable*/
public class Address {

	//@Column(name = "city")	
	private String city;
	//@Column(name = "state")
	private String state;
	//@Column(name = "aptNo")
	private String aptNo;
	//@Column(name = "country")
	private String country;
	
	public Address() {
		
	}

	public Address(String city, String state, String aptNo, String country) {
		this.city = city;
		this.state = state;
		this.aptNo = aptNo;
		this.country = country;
	}
	
	@Override
	public String toString() {
		return city+" "+ state +" "+ aptNo + " "+ country;
	}

}
