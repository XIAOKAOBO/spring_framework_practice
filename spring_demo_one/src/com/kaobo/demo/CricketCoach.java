package com.kaobo.demo;

//import java.util.logging.Logger;

//import org.apache.commons.logging.Log;

public class CricketCoach implements Coach {
	private FortuneService fos;
	private String emailAddress,team;
	
	
	public void setFos(FortuneService fos) {
		this.fos = fos;
		System.out.println("Inside");
	}
//
//	public CricketCoach(FortuneService fos) {
//		super();
//		this.fos = fos;
//	}

	public CricketCoach() {
		super();
		System.out.println("Cricket Coach is generated");
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
//		return null;
		return "doing cricket";
		
		
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fos.getFortune();
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEamilAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

}
