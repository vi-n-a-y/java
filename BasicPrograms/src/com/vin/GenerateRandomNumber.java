package com.vin;

import java.util.Random;

public class GenerateRandomNumber {
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		Random r=new Random();
		int a=r.nextInt(50);
		System.out.println(a);
		int s=r.nextInt(1,7);
		System.out.println(s);
		Double d=r.nextDouble(1.0,45.0);
		System.out.println(d);
		
		System.out.println(Math.random());
	
	}

}
