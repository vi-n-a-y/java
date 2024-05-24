package com.vin;

public class PalindromeString {

	public static void main(String[] args) {
		String str="madam";
		
		String revStr="";
		for(int i=str.length()-1;i>=0;i--) {
			revStr=revStr+str.charAt(i);
			
		}
		System.out.println(revStr);
		System.out.println(str);
		if(str.equals(revStr)) {
			System.out.println("The given string is palindrome : ",str);
		}else {
			System.out.println("The given String is not a palindrome");
		}

	}

}
