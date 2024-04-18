package com.prowings.NoXmlCofig_File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestNoXmlConfig {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaBasedCofig.class);
		// AbstractApplicationContext context = new
		// AnnotationConfigApplicationContext(JavaBasedCofig.class);

		Student s = context.getBean(Student.class);
		System.out.println(s);

		Student s1 = context.getBean(Student.class);
		System.out.println(s1);

		System.out.println(s == s1);

		Bike b = context.getBean("bike", Bike.class);
		System.out.println(b);

		// context.registerShutdownHook();

		System.out.println("No.of Bike bean created: " + Bike.counter);
	}

}