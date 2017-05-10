package com.kaobo.app;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	@Override
	public String getFortune() {
		Random rand = new Random();
		StringBuffer sb = new StringBuffer();
		sb.append("Msg from random service: ");
		sb.append(rand.nextInt(50));
		return sb.toString();
	}

}
