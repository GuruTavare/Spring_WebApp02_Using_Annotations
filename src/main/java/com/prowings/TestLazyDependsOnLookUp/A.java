package com.prowings.TestLazyDependsOnLookUp;

import org.springframework.beans.factory.annotation.Autowired;

public class A {

	private B b;

	public A() {

		System.out.println("A's constructor initialized");
	}
	
	public A(B b) {
		super();
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}

}
