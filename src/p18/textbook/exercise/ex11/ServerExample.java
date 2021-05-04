package p18.textbook.exercise.ex11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		InputStream is = null;
		String fileName = null;
		FileOutputStream fos = null;

		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));

			System.out.println("[서버 시작]");

			socket = serverSocket.accept();
			is = socket.getInputStream();

			byte[] bytes = new byte[1000];
			int readByteCount = -1;

			readByteCount = is.read(bytes, 0, 100);

			fileName = new String(bytes, 0, readByteCount);
			fileName = fileName.trim();

			System.out.println("[파일 받기 시작] " + fileName);
			fos = new FileOutputStream("D:/" + fileName);

			int len = 0;
			while ((len = is.read(bytes)) != -1) {
				fos.write(bytes, 0, len);
			}

			System.out.println("[파일 받기 완료]");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (serverSocket != null) {
				try {
					serverSocket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("[서버 종료]");
	}
}
