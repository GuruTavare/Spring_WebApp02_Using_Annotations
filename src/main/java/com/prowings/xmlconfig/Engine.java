package com.prowings.xmlconfig;

public class Engine {

	private int id;
	private String name;

	public Engine() {

	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Engine [id=" + id + ", name=" + name + "]";
	}
	
}
