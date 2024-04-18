package com.prowings.NoXmlCofig_File;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.prowings.NoXmlCofig_File")
public class JavaBasedCofig {

//	@Bean(name = "student",initMethod = "myInitMethod")
//	//@Scope("prototype")
//	public Student getStudent() {
//		return new Student(10, "Ram", "pune");
//	}
	
	@Bean(name = "bike")
	public Bike getBike() {
		Bike b = new Bike();
		b.setId(101);
		b.setcName("Hero");
		b.setType("Scrambler");
		return b;
	}
	@Bean(name="add1")
	@Primary
	public Address getAdd() {
		return new Address(414151, "malkapur");
	}
	@Bean(name = "add2")

	public Address getAdd1() {
		return new Address(515151, "Kolhapur");
	}
	
}
