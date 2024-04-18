package com.vin;

import java.util.Scanner;

public class NumberToWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		
		switch(n) {
		case 1:if(n==1) 
			System.out.print("one");
		
		break;
		case 2: if(n==2)
			System.out.print("two");
		break;
		case 3 : if(n==3)
			System.out.print("three");
		break;
		case 4 : if(n==4)
			System.out.println("four");
		break;
		case 5 : if(n==5)
			System.out.print("five");
		break;
		case 6: if(n==6)
			System.out.print("six");
		break;
		case 7 : if(n==7)
			System.out.print("seven");
		break;
		case 8 : if(n==8)
			System.out.println("Eight");
		break;
		case 9 : if(n==9)
			System.out.print("Nine");
		break;
		case 10 : if(n==0)
			System.out.print("Zer0");
		break;
		default : System.out.println("wrong input");
	}

}
