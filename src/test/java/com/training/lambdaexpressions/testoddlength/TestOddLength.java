package com.training.lambdaexpressions.testoddlength;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.lambdaexpressions.oddlength.OddLengthRemover;

/**
 * 
 * @author MManjula
 *
 */
public class TestOddLength {
	private List<String> words;
	OddLengthRemover removeOddLength;

	/**
	 * executes before each test case and creates a new object
	 */
	@Before
	public void setup() {
		words = new ArrayList<>();
		removeOddLength = new OddLengthRemover();
		words.add("It's");
		words.add("a");
		words.add("beautiful");
		words.add("sunday");
		words.add("morning");
	}

	/**
	 * Method to test remove() method of OddLengthRemover class
	 */
	@Test
	public void testOddLengthInTheListOfWords() {
		List<String> expectedList = new ArrayList<>();
		expectedList.add("It's");
		expectedList.add("sunday");
		assertEquals(expectedList, removeOddLength.remove(words));
	}

	@After
	public void tearDown() {
		words = null;
		removeOddLength = null;
	}

}
