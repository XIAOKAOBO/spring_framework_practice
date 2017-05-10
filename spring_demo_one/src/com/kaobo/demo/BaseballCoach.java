package com.kaobo.demo;

public class BaseballCoach implements Coach {
	private FortuneService forservice;
	
	public BaseballCoach(FortuneService fors){
		this.forservice = fors;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}
	
	public String getDailyFortune(){
		return this.forservice.getFortune();
	}
	
	public void setFortuneService(FortuneService fos){
		this.forservice=fos;
	}

}








