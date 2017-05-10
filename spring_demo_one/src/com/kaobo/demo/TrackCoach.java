package com.kaobo.demo;

public class TrackCoach implements Coach {
	public static int incre=0;
	private FortuneService fors;
	
	public TrackCoach(FortuneService fors) {
		super();
		this.fors = fors;
	}
	
	public void increStat(){
		incre++;
		System.out.println("intiazlized: incre is "+incre);
	}
	
	public void decStat(){
		incre--;
		System.out.println("Destroying: incre is "+incre);
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}
	
	public String getDailyFortune(){
//		return null;
		return this.fors.getFortune();
	}

}










