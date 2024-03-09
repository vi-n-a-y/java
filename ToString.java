package com.practice.java;

public class ToString {
	String name;
	int age;

	public ToString(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	
	public String toString() {
		return this.name+" "+this.age+" ";
	}
	public static void main(String args[]) {
		
		
		ToString obj=new ToString("balu",20);
		ToString obj1=new ToString("vinay",23);
		
		
		
		System.out.println(obj);
		System.out.println(obj1);
		
	}

}
