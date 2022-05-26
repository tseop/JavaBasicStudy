package com.study.godofjava.chapter25;

public class RunMultiThreads {
	public static void main(String[] args) {
		RunMultiThreads run = new RunMultiThreads();
		run.runMultiThread();

		new Thread(new Runnable() {

			@Override
			public void run() {
				run.runMultiThread();
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				run.runMultiThread();
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				run.runMultiThread();
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				run.runMultiThread();
			}
		}).start();

		run.runMultiThread();

	}

	public void runMultiThread() {
		System.out.println("-------------------------------------\n\n");
		RunnableSample[] runnable = new RunnableSample[5];
		ThreadSample[] threads = new ThreadSample[5];

		for (int i = 0; i < 5; i++) {
			runnable[i] = new RunnableSample();
			threads[i] = new ThreadSample();

//			runnable[i].run();
			new Thread(runnable[i]).start();
			threads[i].start();
		}

		System.out.println("-----RunMultiThreads End-----");
		System.out.println("\n\n-------------------------------------");
	}
}
