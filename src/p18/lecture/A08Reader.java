package p18.lecture;

import java.io.FileReader;
import java.io.Reader;

public class A08Reader {
	public static void main(String[] args) throws Exception {
		String fileName = "src/p18/lecture/A02InputStream.java";
		Reader reader = new FileReader(fileName);
		
//		char datas = (char) reader.read();
//		
//		System.out.println(datas);
//		System.out.println((char) reader.read());
//		System.out.println((char) reader.read());
		
		int i = 0;
		int cnt = 0;
		while ((i = reader.read()) != -1) {
			System.out.println((char) i);
			cnt++;
		}
		
		System.out.println(cnt);
		
		reader.close();
	}
}
