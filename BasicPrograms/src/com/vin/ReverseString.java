package com.vin;

public class ReverseString {

	public static void main(String[] args) {
		
		//using + string concatenation operation 
	String str="bala vinay";
		String str1="";
	
		for(int i=str.length()-1;i>=0;i--) {
			str1=str1+str.charAt(i);
		}
		System.out.println("Reverse using String concatenation operation :"+str1);
		 
		String str2="";
		//using character array
	char a[]=str.toCharArray();
	for(int i=str.length()-1;i>=0;i--) {
		str2=str2+a[i];
	}
	System.out.println("Reverse using character array :"+str1);
						
	StringBuffer sb=new StringBuffer(str);
	StringBuffer str3=sb.reverse();
	System.out.println("Using StringBuffer class :"+str3);
	
	
	}
	
	
	

}
