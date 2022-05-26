package com.study.godofjava.chapter25;

public class RunThreads {
	public static void main(String[] args) {
		RunThreads runnable = new RunThreads();
		runnable.runBasic();
	}

	public void runBasic() {
		RunnableSample sample = new RunnableSample();
		sample.run();

		new Thread(new Runnable() { // 어나니머스 클래스

			@Override
			public void run() {
				System.out.println("홀리!");
			}

		}).start();

		ThreadSample thread = new ThreadSample();
		thread.start();

		System.out.println("RunThread.runBasic() method is ended.");
	}
}
