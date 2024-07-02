package com.vin;

class Computers {
	String Ram;
	String color;
	int memory;
	double price;

	Computers() {

	}

	Computers(String Ram, String color, int memory, double price) {
		this.Ram = Ram;
		this.color = color;
		this.memory = memory;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Computers [Ram=" + Ram + ", color=" + color + ", memory=" + memory + ", price=" + price + "]";
	}

}

class Laptop extends Computers {
	String model;
	String camera;
	int size;
}

public class ConstructorEg {
	public static void main(String args[]) {
		Computers com = new Computers();
		Computers com1 = new Computers("8", "black", 256, 12500);
		System.out.println(com1);
		String str = com.Ram = "225";
		System.out.println(str);

	}
}