package com.training.lambdaexpressions.testfirstletterofwords;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.lambdaexpressions.firstletterofwords.StringGenerator;

public class TestStringOfFirstLetter {
	private StringGenerator generate;

	/**
	 * executes before each test case and creates a new object
	 */
	@Before
	public void setup() {
		generate = new StringGenerator();
	}

	/**
	 * test the generator() method of StringGenerator class
	 */
	@Test
	public void testStringContainingFirstLetterOfEachWord() {
		List<String> words = new ArrayList<>();

		words.add("Good");
		words.add("morning");
		words.add("It's");
		words.add("a");
		words.add("beautiful");
		words.add("day");

		String expected = "gmiabd";
		assertEquals(expected.toLowerCase(), generate.generator(words).toLowerCase());
	}

	/**
	 * Executes after every test case and clears the object
	 */
	@After
	public void tearDown() {
		generate = null;
	}

}
