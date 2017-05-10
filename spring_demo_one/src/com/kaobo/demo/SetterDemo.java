package com.kaobo.demo;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach cC = context.getBean("cricoach",CricketCoach.class);
//		cC.set
		System.out.println(cC.getDailyFortune());
		System.out.println(cC.getTeam());
		context.close();
		
		
		Logger LOGGER = Logger.getLogger(SetterDemo.class.getName());
		LOGGER.setLevel(Level.INFO);
//		System.out.println();
	}

}
