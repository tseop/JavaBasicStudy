package com.study.godofjava.chapter27.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioSample {
	public static void main(String[] args) {
		NioSample sample = new NioSample();
		sample.basicWriteAndRead();
	}

	public void basicWriteAndRead() {
		String fileName = "C:\\godofjava\\text\\nio.text";
		try {
			writeFile(fileName, "My frist NIO sample.");
			readFile(fileName);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("resource")
	public void writeFile(String fileName, String data) throws Exception {
		FileChannel channel = new FileOutputStream(fileName).getChannel();
		byte[] byteData = data.getBytes();
		ByteBuffer buffer = ByteBuffer.wrap(byteData);
		channel.write(buffer);
		channel.close();
	}

	@SuppressWarnings("resource")
	public void readFile(String fileName) throws Exception {
		FileChannel channel = new FileInputStream(fileName).getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		channel.read(buffer);
		buffer.flip();
		while (buffer.hasRemaining()) {
			System.out.print((char) buffer.get());
		}

		channel.close();
	}
}
