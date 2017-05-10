package com.kaobo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomService")
	private FortuneService fos;
	
//	@Autowired
	public TennisCoach() {
		super();
//		this.fos = fos;
		System.out.println(this.fos==null);
		System.out.println("Inside the Constructor");
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Doing Tennis Workout";
		
	}
//	@Autowired
	public void setFos(FortuneService fos) {
		this.fos = fos;
		System.out.println("Injecting a fortune service");
	}
	
//	@Autowired
//	public void something(FortuneService fos){
//		this.fos = fos;
//		System.out.println("doing something");
//	}
	
	public void showFos(){
		System.out.println(this.fos==null);
	}
	
	public String getFortuneService(){
		return this.fos.getFortune();
	}

}
