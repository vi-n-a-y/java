package com.vin;

public class LargestOfNumbers {

	public static void main(String[] args) {
		int a=5,b=4,c=5;
		if(a>b && a>c ) {
			System.out.println("The Largest Number is : "+a);
		}else if(b>a && b>c){
			System.out.println("The Largest Number is : "+b);
		}else if(c>a && c>b) {
				System.out.println("The Largest Number is : "+ c);	
			
		}else if(a==b && b==c && a==c) {
			System.out.println("all the numbers are equal");
		
		
		}else if(a==b || b==c || c==a) {
			System.out.println("two numbers are equal");
		}else
			System.out.println("something went wrong");
		
	//Terinary condition
		
		int largest=a>b?a:b;
		int largest2=largest>c?largest:c;
		System.out.println(largest2);
	}

}
