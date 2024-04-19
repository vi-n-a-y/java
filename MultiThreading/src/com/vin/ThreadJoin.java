package com.vin;

class Studio extends Thread {
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.println(name);

		}
	}
}

public class ThreadJoin {
	public static void main(String args[]) {
		Studio st = new Studio();
		Studio st1 = new Studio();
		Studio st2 = new Studio();
		st.setName("Thread 1");
		st1.setName("Thread 2");
		st2.setName("Thread 3");

		st.start();

		st1.start();
		st2.start();
		try {

			st1.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
