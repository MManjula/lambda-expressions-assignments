package com.training.lambdaexpressions.testarithmeticoperations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.lambdaexpressions.arithmeticoperations.*;

/**
 * 
 * @author MManjula
 *
 */
public class TestArithmeticOperations {
	/**
	 * lambda expressions to define the calculate method
	 */
	ArithmeticOperation addition = (x, y) -> x + y;
	ArithmeticOperation subraction = (x, y) -> x - y;
	ArithmeticOperation multiplication = (x, y) -> x * y;
	ArithmeticOperation division = (x, y) -> x / y;

	/**
	 * test to verify addition of two numbers
	 */
	@Test
	public void testAddition() {
		assertEquals(96, addition.calculate(50, 46), 0.02);
	}

	/**
	 * test to verify subtraction of two numbers
	 */
	@Test
	public void testSubraction() {
		assertEquals(-76.6, subraction.calculate(20, 96.6), 0.02);
	}

	/**
	 * test to verify multiplication of two numbers
	 */
	@Test
	public void testMultiplication() {
		assertEquals(52.5, multiplication.calculate(3.5, 15), 0.02);
	}

	/**
	 * test to verify division of two numbers
	 */
	@Test
	public void testDivision() {
		assertEquals(3.125, division.calculate(50, 16), 0.02);
	}

}
