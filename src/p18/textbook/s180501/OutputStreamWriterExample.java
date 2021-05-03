package p18.textbook.s180501;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {
	public static void main(String[] args) throws Exception {
		String file = "src/p18/textbook/s180501/file.txt";
		FileOutputStream fos = new FileOutputStream(file);
		Writer writer = new OutputStreamWriter(fos);

		String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환";

		writer.write(data);

		writer.flush();
		writer.close();
		fos.close();
		System.out.println("파일 저장이 끝났습니다.");
	}
}
