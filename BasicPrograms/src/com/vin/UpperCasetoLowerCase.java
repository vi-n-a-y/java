package com.vin;

class UpperCase {
	public static char[] toUpper(String str) {
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) (ch[i] + 32);
			}

		}

		return ch;
	}

}

class LowerCase {
	public static char[] toLower(String str) {
		char ch1[] = str.toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] >= 'a' && ch1[i] <= 'z') {
				ch1[i] = (char) (ch1[i] - 32);

			}
		}
		return ch1;
	}
}

public class UpperCasetoLowerCase {
	public static void main(String[] args) {

		String str = "BalaRockzz";
		char ch3[] = UpperCase.toUpper(str);
		char ch4[] = LowerCase.toLower(str);
		System.out.println(ch3);
		System.out.println(ch4);

	}
}
