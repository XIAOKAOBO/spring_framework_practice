package com.kaobo.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TennisCoach theCoach = context.getBean("tennisCoach",TennisCoach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortuneService());
//		theCoach.showFos();
		context.close();
		System.out.println("All work done");
	}

}
