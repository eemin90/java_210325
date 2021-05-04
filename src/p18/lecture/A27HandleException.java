package p18.lecture;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class A27HandleException {
	public static void main(String[] args) {
		String path = "src/p18/lecture/A27HandleException.java";

		// try with resources (auto closable)
		try (FileInputStream fis = new FileInputStream(path);
				FileOutputStream fos = new FileOutputStream(path);
				BufferedInputStream bis = new BufferedInputStream(fis);) {

			fis.read();
			bis.read();
			fos.write('a');

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
