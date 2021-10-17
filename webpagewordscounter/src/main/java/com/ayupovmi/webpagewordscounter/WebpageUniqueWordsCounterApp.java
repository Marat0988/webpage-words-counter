package com.ayupovmi.webpagewordscounter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.jsoup.nodes.Document;

public class WebpageUniqueWordsCounterApp {

	public static void main(String[] args) {
		System.out.println("Dear user if you are mistaken in your input please rerun the program.");
		System.out.println("In next line enter full webpage address, for example https://www.simbirsoft.com/ :");
		String s = ConsoleReader.reader();
		
		Document page = Parser.getPage(s);
		// css query language
		String n = page.text(); 
		// String n = page.body().text(); same result
		String[] words = StringToWordsOnly.getDevided(n);
		HashMap<String, Integer> wordMap = new HashMap<String, Integer>();

		for (String str : words) {
			if (wordMap.get(str) != null) {
				wordMap.put(str, wordMap.get(str) + 1);
			} else {
				wordMap.put(str, 1);
			}
		}
		Map<String, Integer> wordMapSorted = HashMapByValueSorter.sortByValue(wordMap);
		Set<String> str2 = wordMapSorted.keySet();
		for (String str : str2) {
			if (str != " " && str.length() > 1)
				System.out.println(str + " " + wordMapSorted.get(str));
		}
	}
}
