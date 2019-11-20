package com.training.lambdaexpressions.testuppercase;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.lambdaexpressions.uppercase.UpperCase;

public class TestUpperCase {
	private UpperCase upper;

	/**
	 * executes before each test case and creates an object
	 */
	@Before
	public void setup() {
		upper = new UpperCase();
	}

	/**
	 * Test case to check upperCaseConvertor method of UpperCase class
	 */
	@Test
	public void testUpperCaseConverter() {
		List<String> words = new ArrayList<>();
		words.add("Good");
		words.add("morning");
		words.add("It's");
		words.add("a");
		words.add("beautiful");
		words.add("morning");

		List<String> upperCase = new ArrayList<>();
		upperCase.add("GOOD");
		upperCase.add("MORNING");
		upperCase.add("IT'S");
		upperCase.add("A");
		upperCase.add("BEAUTIFUL");
		upperCase.add("MORNING");

		assertEquals(upperCase, upper.convert(words));
	}

	/**
	 * executes after each test case and clears the object
	 */
	@After
	public void tearDown() {
		upper = null;
	}

}
