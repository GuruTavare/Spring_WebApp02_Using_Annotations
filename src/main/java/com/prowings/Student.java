package com.prowings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Student {

	//@Value("100")
	private int roll;
	//@Value("Shubham")
	private String name;
//	 @Autowired
//	 @Qualifier("addr")
	private Address address;

	@Autowired
	public Student( Address address) {
		this.address = address;
	}

	public Student() {
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public void setName(String name) {
		this.name = name;
	}

	// @Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
}
