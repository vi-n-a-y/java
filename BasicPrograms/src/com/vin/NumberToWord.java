package com.vin;

import java.util.Scanner;

public class NumberToWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		int rem1 = 0, rev1 = 0, count = 0;
		while (n > 0) {
			rem1 = n % 10;

			rev1 = rev1 * 10 + rem1;
			n /= 10;
			if (rev1 == 0) {
				count++;
			}

		}

		int rem = 0;

		while (rev1 > 0) {
			rem = rev1 % 10;

			switch (rem) {

			case 0:
				System.out.print("zero ");
				break;
			case 1:

				System.out.print("one ");

				break;
			case 2:

				System.out.print("two ");
				break;
			case 3:

				System.out.print("three ");
				break;
			case 4:

				System.out.print("four ");
				break;
			case 5:

				System.out.print("five ");
				break;
			case 6:

				System.out.print("six ");
				break;
			case 7:

				System.out.print("seven ");
				break;
			case 8:

				System.out.print("Eight ");
				break;
			case 9:

				System.out.print("Nine ");
				break;

			default:
				System.out.print("wrong input");
			}
			rev1 /= 10;

		}
		for (int i = 0; i < count; i++) {
			System.out.print("zero ");
		}

	}
}
