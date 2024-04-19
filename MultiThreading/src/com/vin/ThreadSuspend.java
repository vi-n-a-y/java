package com.vin;

class Example extends Thread {
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 20; i++) {
			System.out.println(name);
		}
	}
}

public class ThreadSuspend {

	public static void main(String[] args) {
		Example ex1 = new Example();
		Example ex2 = new Example();
		Example ex3 = new Example();

		ex1.setName("A");
		ex2.setName("B");
		ex3.setName("C");
		ex1.start();
		ex2.start();
		ex1.yield();
		ex2.suspend();
		ex3.start();
		ex2.resume();
		ex1.yield();

	}

}
