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
			System.out.println("전송하고자 하는 데이터를 입력하세요. 종료하고 싶다면 EXIT 를 입력하세요.");
			text = sc.nextLine();
			sample.sendSocketData(text);
			if (text.equals("EXIT")) {
				System.out.println("통신을 종료합니다.");
				break;
			}

		}
	}

	public void sendSocketData() throws Exception {
		for (int i = 0; i < 3; i++) {
			sendSocketData("I liked java at " + new Date()); // date 클래스를 통해 지속적인 날짜 값을 날린다.
		}

	}

	public void sendSocketData(String data) {
		try {
			System.out.println("Client : Connecting");
			socket = new Socket("127.0.0.1", 9999); // 접속할 ip 주소와 포트번호를 매개변수로 넘긴다.
			System.out.println("Client : Connect status : " + socket.isConnected());

			Thread.sleep(1000);
			outStream = socket.getOutputStream();
			os = new BufferedOutputStream(outStream);
			byte[] bytes = data.getBytes(); // 전달할 데이터를 byte배열로 변환한다.

			os.write(bytes); // 배열을 buffer 객체를 통해 전달한다.
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
