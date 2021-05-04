package p18.textbook.exercise.ex11;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample1 {
	public static void main(String[] args) throws Exception {
		String path = "src/p18/textbook/exercise/ex11/ClientExample1.java";

		Socket socket = new Socket("localhost", 5001);
		OutputStream os = socket.getOutputStream();

		File file = new File(path);

		String fileName = file.getName();
		byte[] arr = new byte[100];
		fileName.getBytes(0, fileName.length(), arr, 0);
		os.write(arr, 0, 100);

		System.out.println("[파일 보내기 시작] " + fileName);
		FileInputStream fis = new FileInputStream(file);

		int len = 0;
		while ((len = fis.read(arr)) != -1) {
			os.write(arr, 0, len);
		}

		os.flush();
		System.out.println("[파일 보내기 완료]");

		fis.close();
		os.close();
		socket.close();
	}
}
