package com.study.godofjava.chapter28.network;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class SocketClientSample {

	private Socket socket = null;
	private OutputStream outStream = null;
	private BufferedOutputStream os = null;

	public static void main(String[] args) {
		SocketClientSample sample = new SocketClientSample();
		Scanner sc = new Scanner(System.in);
		String text;
		while (true) {
			System.out.println("�����ϰ��� �ϴ� �����͸� �Է��ϼ���. �����ϰ� �ʹٸ� EXIT �� �Է��ϼ���.");
			text = sc.nextLine();
			sample.sendSocketData(text);
			if (text.equals("EXIT")) {
				System.out.println("����� �����մϴ�.");
				break;
			}

		}
	}

	public void sendSocketData() throws Exception {
		for (int i = 0; i < 3; i++) {
			sendSocketData("I liked java at " + new Date()); // date Ŭ������ ���� �������� ��¥ ���� ������.
		}

	}

	public void sendSocketData(String data) {
		try {
			System.out.println("Client : Connecting");
			socket = new Socket("127.0.0.1", 9999); // ������ ip �ּҿ� ��Ʈ��ȣ�� �Ű������� �ѱ��.
			System.out.println("Client : Connect status : " + socket.isConnected());

			Thread.sleep(1000);
			outStream = socket.getOutputStream();
			os = new BufferedOutputStream(outStream);
			byte[] bytes = data.getBytes(); // ������ �����͸� byte�迭�� ��ȯ�Ѵ�.

			os.write(bytes); // �迭�� buffer ��ü�� ���� �����Ѵ�.
			System.out.println("Client : Sent data : " + new String(bytes));
			os.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
