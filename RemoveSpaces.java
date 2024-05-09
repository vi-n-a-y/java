package com.vin;

public class RemoveSpaces {

	public static void main(String[] args) {
	
		String str="vi n a y";
		
	String st=str.replaceAll("\\s", "");//by using the method (\\s) means white space 
		System.out.println(st);
//		String st="";
//		char ch[]=str.toCharArray();
//		for(int i=0;i<ch.length;i++) {
//			if(ch[i]!=' ') {
//				st=st+ch[i];
//			}
//		}
//		System.out.println(st);
				
		
	}

}
