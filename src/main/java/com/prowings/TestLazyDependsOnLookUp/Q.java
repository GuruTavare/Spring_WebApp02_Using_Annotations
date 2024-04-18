package com.prowings.TestLazyDependsOnLookUp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Q {
	private int id;
	private P p;

	public Q() {
	}

	@Autowired
	public Q(P p) {
		super();
		this.p = p;
	}

	public int getId() {
		return id;
	}

	public P getP() {
		return p;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setP(P p) {
		this.p = p;
	}

}
