package com.kaobo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Entering the Scope Demo App");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeContext.xml");
		
		//
		Coach theCoach  = context.getBean("myCoach",Coach.class);
		Coach theCoach2 = context.getBean("myCoach",Coach.class);
		boolean equa = (theCoach==theCoach2);
		System.out.println(equa);
		System.out.println(theCoach);
		System.out.println(theCoach2);
		context.close();
		System.out.println("Finished");
	}

}
