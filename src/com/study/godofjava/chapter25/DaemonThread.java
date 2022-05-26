package com.study.godofjava.chapter25;

public class DaemonThread extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			Thread.sleep(2000);
			System.out.println("start..");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
