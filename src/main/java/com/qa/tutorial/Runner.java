package com.qa.tutorial;

public class Runner {

	public static void main(String[] args) {
		Interaction runner = new Interaction();
		System.out.println(runner.greeting() + " " + runner.insult());
	}
}
