package com.prowings;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Component
public class Address {

	//@Value("12345")
	private int pin;
	//@Value("Pune")
	private String city;

	public Address(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}

	public Address() {
		super();
	}

	public int getPin() {
		return pin;
	}

	public String getCity() {
		return city;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}

}
