package com.study.godofjava.chapter31.ForkJoin;

import java.util.concurrent.RecursiveTask;

public class GetSum extends RecursiveTask<Long> {

	/**
	 * Test version = 1
	 */
	private static final long serialVersionUID = 1L;
	long from;
	long to;

	public GetSum(long from, long to) {
		super();
		this.from = from;
		this.to = to;
	}

	@Override
	protected Long compute() {
		long gap = to - from;

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		log("From : " + from + " To : " + to);
		if (gap <= 3) {
			long tempSum = 0;
			for (long i = from; i <= to; i++) {
				tempSum += i;
			}
			log("Return ! " + from + " ~ " + to + " : " + tempSum);
			return tempSum;
		}

		long middle = (from + to) / 2;
		GetSum sumPre = new GetSum(from, middle);
		sumPre.fork();
		GetSum sumPost = new GetSum(middle + 1, to);

		return sumPost.compute() + sumPre.join();
	}

	public void log(String msg) {
		String threadName = Thread.currentThread().getName();
		System.out.println("[ " + threadName + " ] :" + msg);

	}

}
