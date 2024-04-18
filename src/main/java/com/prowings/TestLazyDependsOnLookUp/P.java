package com.prowings.TestLazyDependsOnLookUp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class P {

	private int id;
	private Q q;

	public P() {
	}

	@Autowired
	// if we do not provide @Lazy Annotation will get circular dependency
	// problem...and raises exception saying..BeanCurrentlyInCreationException
	public P(@ Lazy Q q) {
		super();
		this.q = q;
	}

	public int getId() {
		return id;
	}

	public Q getQ() {
		return q;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setQ(Q q) {
		this.q = q;
	}

}
