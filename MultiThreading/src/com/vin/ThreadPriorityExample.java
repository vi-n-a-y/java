package com.vin;

class PriorityExample extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("in run method..." + i);
		}

	}
}

public class ThreadPriorityExample {
	public static void main(String[] args) {
		PriorityExample pe1 = new PriorityExample();
		PriorityExample pe2 = new PriorityExample();
		pe1.start();
		pe2.start();
		pe2.getPriority();
		pe2.setPriority(7);

	}

}
