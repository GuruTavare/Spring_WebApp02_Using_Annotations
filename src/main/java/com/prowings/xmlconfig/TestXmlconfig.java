package com.prowings.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXmlconfig {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring_bean.xml");

		Car c = context.getBean("car", Car.class);
		System.out.println(c);

		Bike b = context.getBean("bike", Bike.class);
		System.out.println(b);

		Truck t = context.getBean("truck", Truck.class);
		System.out.println(t);
		Truck t1 = context.getBean("truck", Truck.class);
		System.out.println(t1);

		System.out.println(t == t1);
	}

}
