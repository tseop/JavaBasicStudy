package com.study.godofjava.chapter27.nio;

import java.nio.IntBuffer;

public class NioDetailSample {
	public static void main(String[] args) {
		NioDetailSample sample = new NioDetailSample();
		sample.checkBufferStatus();
	}

	public void checkBuffer() {

		try {
			IntBuffer buffer = IntBuffer.allocate(1024);

			for (int i = 0; i < 100; i++) {
				buffer.put(i);
			}

			System.out.println("Buffer capacity : " + buffer.capacity());
			System.out.println("Buffer limit : " + buffer.limit());
			System.out.println("Buffer position : " + buffer.position());

			buffer.flip();

			System.out.println("Buffer flipped !");
			System.out.println("Buffer limit : " + buffer.limit());
			System.out.println("Buffer position : " + buffer.position());

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void printBufferStatus(String job, IntBuffer buffer) {
		System.out.println("Buffer " + job + " !!!!");
		System.out.println("Buffer position : " + buffer.position() + " rmaining : " + buffer.remaining() + " limit : "
				+ buffer.limit());
	}

	public void checkBufferStatus() {
		try {
			IntBuffer buffer = IntBuffer.allocate(1024);
			buffer.get();
			printBufferStatus("get", buffer);

			buffer.mark();
			printBufferStatus("mark", buffer);

			buffer.get();
			printBufferStatus("get", buffer);

			buffer.reset();
			printBufferStatus("reset", buffer);

			buffer.rewind();
			printBufferStatus("rewind", buffer);

			buffer.clear();
			printBufferStatus("clear", buffer);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
