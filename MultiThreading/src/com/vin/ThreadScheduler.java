package com.vin;

class SchedulerTest extends Thread {
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.println(name);
		}
	}
}

public class ThreadScheduler {

	public static void main(String[] args) {
		SchedulerTest scTest1 = new SchedulerTest();
		SchedulerTest scTest2 = new SchedulerTest();
		SchedulerTest scTest3 = new SchedulerTest();

		scTest1.setName("Thread 1");
		scTest2.setName("Thread 2");
		scTest3.setName("Thread 3");

		scTest1.start();
		scTest2.start();
		scTest3.start();
	}

}
//Thread Scheduler :- Thread Scheduler is the part of JVM which executes multiple threads on a single processor randomly.
//algorithms
//1) First come First Service(FCFS)
//2) Round Robin
