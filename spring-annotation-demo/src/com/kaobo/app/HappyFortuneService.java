package com.kaobo.app;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
//		return null;
		return "It's a lucky day~";
	}

}
