package com.prowings;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.prowings")
public class Bean_Config {

	@Bean(name = "employee")
	public Employee getEmpoyee() {
		Employee emp = new Employee();
		emp.setId(10);
		emp.setName("Sumit");
		emp.setAddress("Kop");
		return emp;
	}

	@Bean(name = "student")
	public Student getStudent() {
		Student std = new Student();
		std.setRoll(10);
		std.setName("Ram");

		return std;
	}

	@Bean(name = "addr")
	@Primary
	public Address getAdd() {
		Address addr = new Address();
		addr.setPin(415101);
		addr.setCity("pune");
		return addr;

	}

	@Bean(name = "addr1")
	// @Primary
	public Address getAdd1() {
		Address addr = new Address();
		addr.setPin(416512);
		addr.setCity("kop");
		return addr;
	}

}
