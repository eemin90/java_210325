package p18.lecture.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;

public class A03SocketClient {
	public static void main(String[] args) {
		Socket socket = null;
		InputStream is = null;
		InputStreamReader isr = null;
		
		try {
			socket = new Socket();
			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("192.168.35.45", 5001));
			System.out.println("[연결 성공]");
			
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			char[] cbuf = new char[100];
			int len = isr.read(cbuf);
			String message = new String(cbuf, 0, len);
			System.out.println(message);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (isr != null) {
				try {
					isr.close();
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
		}
	}
}
