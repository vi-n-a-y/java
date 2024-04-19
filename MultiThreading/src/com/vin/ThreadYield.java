package com.vin;

class Example1 extends Thread {
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.println(name);
			Thread.yield();
		}
	}
}

class Example2 extends Thread {
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.println(name);

		}
	}

}

public class ThreadYield {
	public static void main(String[] args) {
		Example ex1 = new Example();
		Example2 ex2 = new Example2();
		ex1.setName("A");
		ex2.setName("B");

		ex1.start();

		ex2.start();
	}

}
