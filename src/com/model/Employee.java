package com.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private Integer id;
	private String name;
	private String email;
	private Double salary;
	public Employee() {
		super();
		System.out.println("Employee Default Constructor");
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer id, String name, String email, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		System.out.println("Id Setter");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Name Setter");
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		System.out.println("Email Setter");
		this.email = email;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		System.out.println("Salary Setter");
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}
	
	@PostConstruct
	public void init() throws Exception{
		System.out.println("Customer Bean is going through init process..");
	}
	
	@PreDestroy
	public void destroy() throws Exception{
		System.out.println("Customer bean going to destroy..");
	}
	
	

}
