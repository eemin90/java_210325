package p18.lecture;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class A13FileCopy {
	public static void main(String[] args) throws Exception {
		// 파일 복사 Reader, Writer 이용
		
		String src = "src/p18/lecture/A13FileCopy.java";
		String des = "src/p18/lecture/A13FileCopy.copy";
		
		Reader fr = new FileReader(src);
		Writer fw = new FileWriter(des);
		
		char[] datas = new char[30];
		int len = 0;
		while ((len = fr.read(datas)) != -1) {
			fw.write(datas, 0, len);
		}
		
		fr.close();
		fw.close();
		
		System.out.println("복사 완료");
	}
}
