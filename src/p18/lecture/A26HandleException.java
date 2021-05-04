package p18.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class A26HandleException {
	public static void main(String[] args) {
		String path = "src/p18/lecture/A26HandleException.java";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
