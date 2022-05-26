package com.study.godofjava.chapter25;

public class NameCalcThread extends Thread {

	int cal;

	public NameCalcThread(String name, int cal) {
		// TODO Auto-generated constructor stub
		super(name);
		this.cal = cal;
	}

	@Override
	public void run() {
		cal++;
		System.out.println(cal);

	}

}
