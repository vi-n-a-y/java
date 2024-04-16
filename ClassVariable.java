package com.vin;

public class ClassVariable {
	public static int a=0;
	public ClassVariable() {
		a++;
	}
	public static void main(String args[]) {
		ClassVariable cv=new ClassVariable();
		ClassVariable cv1=new ClassVariable();
		ClassVariable cv2=new ClassVariable();
		
		System.out.println("The value in variable is : "+ClassVariable.a);
	}

}
