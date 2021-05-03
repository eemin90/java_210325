package p18.textbook.s180502;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		String file = "src/p18/textbook/s180502/BufferedInputStreamExample.java";
		FileInputStream fis1 = new FileInputStream(file);
//		start = System.currentTimeMillis();
		start = System.nanoTime();
		while (fis1.read() != -1) {
			
		}
//		end = System.currentTimeMillis();
		end = System.nanoTime();
		System.out.println("사용하지 않았을 때: " + (end - start) + "ms");
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis2); // 버퍼 스트림 생성
//		start = System.currentTimeMillis();
		start = System.nanoTime();
		while (bis.read() != -1) {
			
		}
//		end = System.currentTimeMillis();
		end = System.nanoTime();
		System.out.println("사용했을 때: " + (end - start) + "ms");
		bis.close();
		fis2.close();
	}
}
