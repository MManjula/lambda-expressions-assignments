package com.training.lambdaexpressions.uppercase;

import java.util.List;
import java.util.function.UnaryOperator;

/**
 * 
 * @author MManjula
 *
 */
public class UpperCase {
	/**
	 * 
	 * @param words
	 * @return all words in upper case
	 */
	public Object convert(List<String> words) {
		UnaryOperator<String> result = e -> e.toUpperCase();
		words.replaceAll(result);
		return words;
	}

}
