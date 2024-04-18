package com.prowings.TestLazyDependsOnLookUp;

import org.springframework.beans.factory.annotation.Autowired;

public class B {
	private A a;

	public B() {
	
		System.out.println("B's constructor initialized");
	}
	public B(A a) {
		super();
		this.a = a;
	}

	@Override
	public String toString() {
		return "B [a=" + a + "]";
	}

}
