package com.prowings.xmlconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class Bike {

	@Value("Hero")
	private String cname;
	@Value("Sport")
	private String type;

	public Bike() {
	}

	public String getCname() {
		return cname;
	}

	public String getType() {
		return type;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Bike [cname=" + cname + ", type=" + type + "]";
	}
}
