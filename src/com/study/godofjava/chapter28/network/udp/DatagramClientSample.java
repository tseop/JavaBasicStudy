package com.study.godofjava.chapter28.network.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

public class DatagramClientSample {
	public static void main(String[] args) {
		DatagramClientSample sample = new DatagramClientSample();
		sample.sendDatagramSample();
	}

	public void sendDatagramSample() {
		for (int i = 0; i < 3; i++) {
			sendDatagramData("I liked UDP " + new Date());

			try { // 시간 조절을 위한 Thread sleep 1s
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		sendDatagramData("EXIT");
	}

	public void sendDatagramData(String data) {
		try {
			DatagramSocket client = new DatagramSocket();
			InetAddress address = InetAddress.getByName("127.0.0.1");

			byte[] buffer = data.getBytes();
			DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length, address, 9999);
			client.send(packet);

			System.out.println("Client : Sent data : " + data);
			client.close();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
