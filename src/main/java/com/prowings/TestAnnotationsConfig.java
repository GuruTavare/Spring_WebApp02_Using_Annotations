package com.prowings;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationsConfig {

	public static void main(String[] args) {

		//ApplicationContext ctx= new ClassPathXmlApplicationContext("spring_bean.xml");
		
//		Employee e1= ctx.getBean("employee", Employee.class);
//		System.out.println(e1);
//		
//		A a= ctx.getBean("a", A.class);
//		System.out.println(a);
		
		ApplicationContext context =new AnnotationConfigApplicationContext(Bean_Config.class);
		
	//	System.out.println(context.getBeanDefinitionCount());
	//	System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		
		Student s1=context.getBean("student",Student.class);
		System.out.println(s1);
	}

}
