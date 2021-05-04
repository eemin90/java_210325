package p18.textbook.exercise.ex11;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		OutputStream os = null;
		String path = "src/p18/textbook/exercise/ex11/ClientExample.java";
		File file = null;
		String fileName = null;
		FileInputStream fis = null;

		try {
			socket = new Socket("localhost", 5001);
			os = socket.getOutputStream();

			file = new File(path);

			fileName = file.getName();

			byte[] bytes = new byte[1000];
			fileName.getBytes(0, fileName.length(), bytes, 0);
			os.write(bytes, 0, 100);

			System.out.println("[파일 보내기 시작] " + fileName);
			fis = new FileInputStream(file);

			int len = 0;
			while ((len = fis.read(bytes)) != -1) {
				os.write(bytes, 0, len);

			}

			os.flush();
			System.out.println("[파일 보내기 완료]");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (os != null) {
				try {
					os.close();
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
