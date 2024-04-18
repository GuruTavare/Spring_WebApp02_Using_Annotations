package com.prowings.TestLazyDependsOnLookUp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_DependsOn_Lazy_LookUp_ {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);

		// --------------------@DependsON-----------------------------------
		
		A a = context.getBean("beanA", A.class);
		System.out.println(a);
		B b = context.getBean("beanB", B.class);
		System.out.println(b);
		
		//---------------@Lazy--------------
		P p = context.getBean("p", P.class);
		Q q = context.getBean("q", Q.class);

		System.out.println(p);
		System.out.println(q);
		
		//---------------@LookUP-----------
		SingltonBean bean = context.getBean(SingltonBean.class);
		bean.usePrototype();

		SingltonBean bean2 = context.getBean(SingltonBean.class);
		bean2.usePrototype();
	}

}
