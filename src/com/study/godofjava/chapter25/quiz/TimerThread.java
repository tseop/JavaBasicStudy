package com.study.godofjava.chapter25.quiz;

import java.util.Date;

public class TimerThread extends Thread {

	@Override
	public void run() {
		printCurrentTime();
	}

	public void printCurrentTime() {
		Date data;

		for (int i = 0; i < 10; i++) {
			try {
				data = new Date();
				System.out.println(data.toString() + " " + (System.currentTimeMillis() / 1000));
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
