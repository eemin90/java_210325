package p18.lecture;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class A06FileCopy {
	public static void main(String[] args) throws Exception {
		String src = "src/p18/lecture/A02InputStream.java";
		String des = "src/p18/lecture/A02InputStream.copy";
		
		InputStream is = new FileInputStream(src);
		OutputStream os = new FileOutputStream(des);
		
		int data = 0;
		
		while ((data = is.read()) != -1) { // is.read()에서 읽은 것을 data에 대입해서
			os.write(data); // os.write()에 전달
		}
		
		is.close();
		os.close();
	}
}
