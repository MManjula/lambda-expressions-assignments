package com.training.lambdaexpressions.firstletterofwords;

import java.util.List;

/**
 * 
 * @author MManjula
 *
 */
public class StringGenerator {
	/**
	 * 
	 * @param words
	 * @return string of letters containing first letter of the string of words
	 */
	public String generator(List<String> words) {
		StringBuilder stringBuilder = new StringBuilder();
		words.forEach(e -> stringBuilder.append(e.charAt(0)));
		return stringBuilder.toString();
	}

}
