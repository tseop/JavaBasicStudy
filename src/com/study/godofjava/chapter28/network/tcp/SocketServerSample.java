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
			server = new ServerSocket(9999); // 9999��Ʈ�� ����ϴ� ���� ������ �����Ѵ�.

			while (true) {
				System.out.println("Server:Waiting for request.");
				client = server.accept(); // ����ȣ�� ��� ���·� ��ȯ

				System.out.println("Server:Accepted.");

				InputStream stream = client.getInputStream(); // �����͸� �ޱ� ���� getInputStream() ȣ���Ͽ� InputStream ��ü�� ����

				// InputStream �����͸� Buffer�� �̿��Ͽ� ����
				BufferedReader in = new BufferedReader(new InputStreamReader(stream));

				String data = null;
				StringBuilder receivedData = new StringBuilder();

				while ((data = in.readLine()) != null) { // data �� BufferReader �� ���� �����͸� ������ null üũ
					receivedData.append(data); // data�� ���� ������ StringBuilder ��ü�� ���� �ִ´�.
				}

				System.out.println("Received data : " + receivedData);
				in.close();
				stream.close();
				client.close();

				if (receivedData != null && "EXIT".equals(receivedData.toString())) { // Ŭ���̾�Ʈ�� EXIT ���� ������ ���� ����� ������.
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
