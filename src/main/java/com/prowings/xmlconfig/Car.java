package com.prowings.xmlconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	private int id;
	private String name;
	private String type;
	
	@Autowired
	private Engine engine;

	public Car() {
	}

	public void setEngine(Engine engine) {
		this.engine=engine;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}
	public Engine getEngine() {
		return engine;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", type=" + type + ", engine=" + engine + "]";
	}


}
