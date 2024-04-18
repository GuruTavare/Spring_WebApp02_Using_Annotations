package com.prowings.NoXmlCofig_File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Student {

	
	private int rollNum;
	private String name;
	private String address;
	@Autowired
	private Address addr;
	public Student() {
	}

	public Student(int rollNum, String name, String address) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.address = address;
	}
	
	public Student(int rollNum, String name, String address, Address addr) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.address = address;
		this.addr = addr;
	}

	public void myInitMethod() {
	
		System.out.println("inside myinit method...");
	}

	public int getRollNum() {
		return rollNum;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", name=" + name + ", address=" + address + ", addr=" + addr + "]";
	}

}
