package com.vin;

import java.util.Arrays;

public class StringAnagram {

	public static String stringAnagram(String str, String strr) {
		
		String str1=str.replaceAll("\\s", "").toLowerCase();
		String str2=strr.replaceAll("\\s", "").toLowerCase();
		if (str1.length() != str2.length()) {
			return "not a anagram String";
		}
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if (Arrays.equals(ch1, ch2)) {
			return "the given String is anagram";
		} else {
			return "The give String is not a anagram";

		}

	}

	public static void main(String args[]) {
		System.out.println(stringAnagram("Race", "care"));
	}

}
