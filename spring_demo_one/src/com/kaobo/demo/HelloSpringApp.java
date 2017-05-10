package com.kaobo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
//		Coach t = new TrackCoach();
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		Coach theCoach2 = context.getBean("myCoach2",Coach.class);
		System.out.println(theCoach2.getDailyWorkout());
		System.out.println(theCoach2.getDailyFortune());
		System.out.println(theCoach.getDailyFortune());
		context.close();
	}

}







