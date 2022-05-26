package com.study.godofjava.chapter25;

public class RunSync {
	public static void main(String[] args) {
		RunSync rs = new RunSync();
		int a = 0;
		long startTime = System.currentTimeMillis();
		while (a < 1000) {
			System.out.print((a + 1) + " ");
			rs.runCommonCalculate();
			a++;
		}

		long endTime = System.currentTimeMillis();
		;
		System.out.println(endTime - startTime);
	}

	public void runCommonCalculate() {
		CommonCalculate calc = new CommonCalculate();
		ModifyAmountThread thread1 = new ModifyAmountThread(calc, true);
		ModifyAmountThread thread2 = new ModifyAmountThread(calc, true);

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
			System.out.println("Final value if " + calc.getAmount());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
