package p18.lecture.network;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class A02Socket {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter osw = null;

		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("192.168.35.45", 5001));

			System.out.println("[연결 기다림]");
			socket = serverSocket.accept();
			System.out.println("[연결 완료]");
			InetSocketAddress address = (InetSocketAddress) socket.getRemoteSocketAddress();
			System.out.println(address.getAddress());

			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			osw.write("hello client");
			osw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				if (osw != null) {
					osw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				if (socket != null) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				if (serverSocket != null) {
					serverSocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
