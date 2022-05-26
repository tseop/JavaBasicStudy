package com.study.godofjava.chapter25;

public class RunSupportThreads {
	public static void main(String[] args) {
		RunSupportThreads sample = new RunSupportThreads();
		sample.checkJoin();
	}

	public void checkThreadState1() {
		SleepThread thread = new SleepThread(2000);

		try {
			System.out.println("thread state : " + thread.getState());
			thread.start();
			System.out.println("thread state(after start) : " + thread.getState());

			Thread.sleep(1000);
			System.out.println("thread state(after 1 sec) : " + thread.getState());

			thread.join();
			thread.interrupt();

			System.out.println("thread state(after join) : " + thread.getState());

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void checkJoin() {
		SleepThread sample = new SleepThread(2000);

		try {
			sample.start();

			sample.join(2050);
			sample.interrupt();
			System.out.println("thread state(after join) : " + sample.getState());

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
