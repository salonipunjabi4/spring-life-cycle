package com.model;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private Integer id;
	private String state;
	private String street;
	private String county;
	private Long pinCode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(Integer id, String state, String street, String county, Long pinCode) {
		super();
		this.id = id;
		this.state = state;
		this.street = street;
		this.county = county;
		this.pinCode = pinCode;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public Long getPinCode() {
		return pinCode;
	}
	public void setPinCode(Long pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", state=" + state + ", street=" + street + ", county=" + county + ", pinCode="
				+ pinCode + "]";
	}
	
	

}
