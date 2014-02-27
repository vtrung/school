package com.example.crystalball;

import java.util.Random;

public class CrystalBall {
	
	private String[] answers = {
			"Yes",
			"No",
			"Maybe",
			"You tell me!",
			"I don't know",
			"Definitely",
			"No Way!"
	};
	
	public String get_answer(){
			String answer = "";
			Random randomGen = new Random();
			int randomNum = randomGen.nextInt(answers.length);
			answer = answers[randomNum];
			return answer;
	}
}
