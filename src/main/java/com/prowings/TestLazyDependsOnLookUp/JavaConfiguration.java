package com.prowings.TestLazyDependsOnLookUp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
@ComponentScan(basePackages = "com.prowings.TestLazyDependsOnLookUp")
public class JavaConfiguration {
	
	@Bean("beanA")
	@DependsOn("beanB")
	public A getA() {
		return new A();
	}
	@Bean("beanB")
	public B getB() {
		return new B();
	}

}
