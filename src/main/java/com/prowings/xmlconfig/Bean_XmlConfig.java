package com.prowings.xmlconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Bean_XmlConfig {
	@Bean(name = "truck")
	@Scope("prototype")
	public Truck getTruck1() {
		return new Truck("Eicher", 101);
	}
	@Bean(name = "truck1")
	public Truck getTruck2() {
		return new Truck("TATA", 102);
	}
	
}
