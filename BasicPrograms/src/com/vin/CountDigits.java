package com.vin;

public class CountDigits {

	public static void main(String[] args) {
		
		//count of digits in a number
		int num = 123456;
		int count = 0;
		while (num > 0) {
			num /= 10;
			count++;

		}
		System.out.println("Total Number of Digits in a Number are " + count);
		
		// count of even and odd numbers in a number
		int num2 = 2137676;
		int rem, even = 0, odd = 0;
		System.out.println("The given number is " + num2);
		while (num2 > 0) {
			rem = num2 % 10;
			if (rem % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			num2 /= 10;
		}
		System.out.println("The number of Even Numbers in a number are " + even);
		System.out.println("The number of odd numbers in a number are " + odd);
		
		//sum of number
		int num3=445456;
		int rem3=0,sum=0;
		while(num3>0) {
			rem3=num3%10;
			sum=sum+rem3;
			num3/=10;
		}
		System.out.println("The sum of Number is "+sum);

	}

}
