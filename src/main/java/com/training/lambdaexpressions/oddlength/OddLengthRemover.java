package com.training.lambdaexpressions.oddlength;

import java.util.List;

/**
 * 
 * @author MManjula
 *
 */
public class OddLengthRemover {
	/**
	 * 
	 * @param words
	 * @return words with even length
	 */
	public List<String> remove(List<String> words) {
		words.removeIf(e -> e.length() % 2 != 0);
		return words;
	}

}
