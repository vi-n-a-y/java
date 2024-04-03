package com.vin;

public class PalindromeString {

	public static void main(String[] args) {
		String str="madam";
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
		System.out.println(str);
		if(str.equals(rev)) {
			System.out.println("the given string is palindrome");
		}else {
			System.out.println("the given String is not a palindrome");
		}

	}

}
