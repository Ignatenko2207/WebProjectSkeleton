package it.dan.service;

public class ReverseService {

	public static String reverseString(String text) {
		
		char[] symbols = text.toCharArray();
		
		String out = "";
		
		for (int i = symbols.length - 1; i >= 0; i--) {
			out += symbols[i];
		}
		
		return out;
	}

	
}
