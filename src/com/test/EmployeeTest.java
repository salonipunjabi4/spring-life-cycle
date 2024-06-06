package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Address;
import com.model.Customer;
import com.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Bean.xml");
//		Employee emp = ctx.getBean(Employee.class);
//		//Employee emp1 = ctx.getBean("e", Employee.class);
//		//Employee emp2 = ctx.getBean("e", Employee.class);
//		
//		emp.setId(101);
//		emp.setEmail("allen@gmail.com");
//		emp.setName("allen");
//		emp.setSalary(3456.9);
//		//System.out.println(emp.hashCode() + "," + emp1.hashCode() + "," + emp2.hashCode());
//		System.out.println(emp.getId() + "," + emp.getName() + "," + emp.getEmail() + "," + emp.getSalary());
//		ctx.close();
		
		Customer customer = ctx.getBean(Customer.class); //has a relationship
		Address address = customer.getAddress();
		customer.setId(101);
		customer.setAge(30);
		customer.setName("Allen");
			address.setId(1);
			address.setCounty("USA");
			address.setStreet("ABC");
			address.setState("XYZ");
			
		System.out.println("Customer details");
		System.out.println(customer.getId() + "," + customer.getName() + "," + customer.getAge());
		System.out.println("Address details");
		System.out.println(address.getId() + "," + address.getStreet() + "," + address.getState() + "," + address.getCounty());
		
		ctx.close();

	}

}

//Setter dependency injection -- property tag