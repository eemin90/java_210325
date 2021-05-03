package p18.lecture;
// 한글추가됨

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class A17FilterStream {
	public static void main(String[] args) throws Exception {
		// InputStream --> Reader
		String file = "src/p18/lecture/A17FilterStream.java";
		InputStream is = getInputStream(file);
		InputStreamReader isr = new InputStreamReader(is); // 문자 변환 보조 스트림 (필터 스트림)
		
		int b = 0;
		
		while ((b = isr.read()) != -1) {
			System.out.print((char) b);
		}
		
		is.close();
		isr.close();
	}
	
	public static InputStream getInputStream(String file) throws Exception {
		return new FileInputStream(file);
	}
}
