package com.vin;
class FactTest{
	public int factValue(int n){
		if(n<=1) {
			return 1;
		}else {
			return n*factValue(n-1);
		}
			
	}
}
public class FactorialRecurssion{
	public static void main(String args[]) {
		FactTest f=new FactTest();
		System.out.println(f.factValue(6));
	}
}

	


