package com.prowings;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @Repository,@Controller,@Service and @Configuration are equivalent
 *                                  to @Componenet Annotation
 */
//@Repository
//@Controller
//@Service
//@Configuration
@Component
public class A {
	@Value(value = "415101")
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "A [id=" + id + "]";
	}

}
