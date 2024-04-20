package com.vin;

class Example extends Thread {
	public void run() {
		String name = currentThread().getName();
		for (int i = 0; i < 20; i++) {
			System.out.println(name);
		}

	}
}

public class StopThreadMethod {
	public static void main(String args[]) {
		Example ex = new Example();
		ex.start();
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		ex.stop();
	}

}
