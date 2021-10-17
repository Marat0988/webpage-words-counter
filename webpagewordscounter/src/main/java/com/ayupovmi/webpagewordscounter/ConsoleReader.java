package com.ayupovmi.webpagewordscounter;

import java.util.Scanner;

public class ConsoleReader {
	public static String reader() {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		return s;
	}
}
