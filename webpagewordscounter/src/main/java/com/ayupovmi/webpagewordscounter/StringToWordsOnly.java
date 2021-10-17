package com.ayupovmi.webpagewordscounter;

public class StringToWordsOnly {
	public static String[] getDevided(String s) {
		// Converts the string into lowercase
		s = s.toLowerCase();
		// Split the string into words using built-in function
		String[] words = s.replace(' ', ' ').replace(',', ' ').replace('.', ' ').replace('?', ' ').replace('?', ' ')
				.replace('!', ' ').replace('@', ' ').replace('#', ' ').replace('$', ' ').replace('%', ' ')
				.replace('^', ' ').replace('&', ' ').replace('*', ' ').replace('(', ' ').replace(')', ' ')
				.replace('_', ' ').replace('-', ' ').replace('=', ' ').replace('+', ' ').replace('/', ' ')
				.replace('*', ' ').replace('1', ' ').replace('2', ' ').replace('3', ' ').replace('4', ' ')
				.replace('5', ' ').replace('6', ' ').replace('7', ' ').replace('8', ' ').replace('9', ' ')
				.replace('<', ' ').replace('>', ' ').replace('/', ' ').replace('\\', ' ').replace('|', ' ')
				.replace(':', ' ').replace(';', ' ').replace('\'', ' ').replace('"', ' ').replace('[', ' ')
				.replace(']', ' ').replace('{', ' ').replace('}', ' ').replace('~', ' ').replace('`', ' ')
				.replace('0', ' ').replace('©', ' ').replace('—', ' ').replace('«', ' ').replace('»', ' ')
				.replace('№', ' ').split(" ");
		return words;
	}

}
