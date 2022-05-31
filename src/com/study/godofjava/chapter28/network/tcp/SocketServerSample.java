package com.study.godofjava.chapter28.network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerSample {
	public static void main(String[] args) {
		SocketServerSample serverSample = new SocketServerSample();
		serverSample.startServer();
	}

	public void startServer() {
		ServerSocket server = null;
		Socket client = null;

		try {
			server = new ServerSocket(9999); // 9999포트를 사용하는 서버 소켓을 생성한다.

			while (true) {
				System.out.println("Server:Waiting for request.");
				client = server.accept(); // 원격호출 대기 상태로 전환

				System.out.println("Server:Accepted.");

				InputStream stream = client.getInputStream(); // 데이터를 받기 위해 getInputStream() 호출하여 InputStream 객체를 받음

				// InputStream 데이터를 Buffer를 이용하여 읽음
				BufferedReader in = new BufferedReader(new InputStreamReader(stream));

				String data = null;
				StringBuilder receivedData = new StringBuilder();

				while ((data = in.readLine()) != null) { // data 에 BufferReader 로 읽은 데이터를 넣으며 null 체크
					receivedData.append(data); // data에 값이 있으면 StringBuilder 객체에 값을 넣는다.
				}

				System.out.println("Received data : " + receivedData);
				in.close();
				stream.close();
				client.close();

				if (receivedData != null && "EXIT".equals(receivedData.toString())) { // 클라이언트가 EXIT 값을 보내면 소켓 통신을 끝낸다.
					System.out.println("Stop SocketServer");
					break;
				}

				System.out.println("--------------");
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (server != null) {
				try {
					server.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
