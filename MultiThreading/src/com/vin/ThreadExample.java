package com.vin;

class ThreadTest extends Thread {// MultiThreading is a process to execute multiple threads at the same time
									// without dependency of other threads called multiThreading
	// Thread is a pre-defined class which is available in java.lang package. Thread
	// is a basic unit of CPU it is well known for independent execution.
	public void run() {// child thread
		for (int i = 0; i < 10; i++) {
			System.out.println("java");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException inEx) {
				inEx.printStackTrace();
			}
		}
	}

}

public class ThreadExample {
	public static void main(String args[]) throws InterruptedException {// main thread
		ThreadTest thEx = new ThreadTest();
		thEx.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Platform independent");
			Thread.sleep(1000);

		}

	}
}
