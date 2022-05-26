package com.study.godofjava.chapter25;

public class SleepThread extends Thread {

	long sleepTime;

	public SleepThread(long sleepTime) {
		this.sleepTime = sleepTime;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {

		try {
			System.out.println("Sleeping " + getName());
			Thread.sleep(sleepTime);
			System.out.println("Stopping " + getName());

		} catch (InterruptedException e) {
			e.printStackTrace();

		}

	}
}
