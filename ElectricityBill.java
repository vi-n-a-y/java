package com.vin;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int units = sc.nextInt();

		int amount = 0;
		if (units > 100 && units <= 200) {
			amount = units * 6;
		} else if (units > 200 && units <= 300) {
			amount = units * 7;
		} else if (units > 300) {
			amount = units * 8;
		} else {
			amount = units * 5;
		}

		System.out.println("The total Electricity amount is :" + amount);

	}

}


