package p18.lecture;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class A04OutputStream {
	public static void main(String[] args) throws Exception {
		String fileName = "src/p18/lecture/output1.txt";
		OutputStream os = new FileOutputStream(fileName);
		
		os.write(97);
		os.write(97);
		
		os.close();
	}
}
