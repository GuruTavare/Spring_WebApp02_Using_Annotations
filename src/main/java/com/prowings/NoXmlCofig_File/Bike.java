package com.prowings.NoXmlCofig_File;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bike {

	private int id;
	private String cName;
	private String type;
	@Autowired
	//@Qualifier("add2")
	private Address addr;

	static int counter;

	public Bike() {
		super();
		counter++;
	}

	public Bike(int id, String cName, String type, Address addr) {
		super();
		this.id = id;
		this.cName = cName;
		this.type = type;
		this.addr = addr;
	}

	@PostConstruct
	public void init() {
		System.out.println("Bikes init()");
	}

	@PreDestroy
	public void destroy() {

		System.out.println("Bikes destroy()");

	}

	public int getId() {
		return id;
	}

	public String getcName() {
		return cName;
	}

	public String getType() {
		return type;
	}

	public Address getAddr() {
		return addr;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Bike [id=" + id + ", cName=" + cName + ", type=" + type + ", addr=" + addr + "]";
	}

}
