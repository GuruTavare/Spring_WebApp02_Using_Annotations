package com.prowings.TestLazyDependsOnLookUp;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;
@Component
public class SingltonBean {

	public void usePrototype() {

		PrototypeBean dependency = createPrototypeDependency();
		dependency.doSomething();
	}
    @Lookup
	protected PrototypeBean createPrototypeDependency() {
    	// This method body will be replaced by Spring at runtime
		return null;
	}

}
