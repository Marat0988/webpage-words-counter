package com.ayupovmi.webpagewordscounter;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Parser {
	public static Document getPage(String url) {
		
		Document page = null;
		try {
			page = Jsoup.parse(new URL(url), 3000);

		} catch (MalformedURLException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println(e);
			
		}
		return page;
	}
}
