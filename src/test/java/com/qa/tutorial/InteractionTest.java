package com.qa.tutorial;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class InteractionTest {
	Interaction interaction;
	@Before
	public void setUp() {
		interaction = new Interaction();
	}
	
	@Test
	public void greetingTest() {
		assertTrue(interaction.greeting().equals("Hi friend"));
	}
	
	@Test
	public void insultTest() {
		assertEquals("is trash",interaction.insult());
	}
	
}
