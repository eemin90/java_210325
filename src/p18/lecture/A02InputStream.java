package p18.lecture;

import java.io.FileInputStream;
import java.io.InputStream;

public class A02InputStream {
	public static void main(String[] args) throws Exception {
		String fileName = "src/p18/lecture/A02InputStream.java";
		InputStream is = new FileInputStream(fileName);
		
//		int b1 = is.read();
//		int b2 = is.read();
//		int b3 = is.read();
//		
//		System.out.println(b1);
//		System.out.println(b2);
//		System.out.println(b3);
		
		int b = 0;
		int cnt = 0;
		while ((b = is.read()) != -1) {
			System.out.println(++cnt);
		}
		
		is.close();
	}
}
