package com.vin;

class RunnableTest implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("child Thread");
			try {
				Thread.sleep(100);
			}catch(InterruptedException inEx) {
				inEx.printStackTrace();
			}

		}

	}

}

public class RunnableExample {
	public static void main(String args[]) {
		RunnableTest runTest = new RunnableTest();
		Thread th = new Thread(runTest);
		th.start();
		th.setPriority(4);
		for (int i = 0; i < 100; i++) {
			System.out.println("main Thread");
		}
	}
}
