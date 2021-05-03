package p18.lecture;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class A07FileCopy {
	public static void main(String[] args) throws Exception {
		String src = "src/p18/lecture/A02InputStream.java";
		String des = "src/p18/lecture/A02InputStream.copy2";
		
		InputStream is = new FileInputStream(src);
		OutputStream os = new FileOutputStream(des);
		
		byte[] datas = new byte[20];
		int len = 0;
		while ((len = is.read(datas)) != -1) {
			os.write(datas, 0, len); // datas 배열[20]을 0에서 len개 까지 보낸다
		}							 // src의 파일 크기는 593byte이고 datas 배열 크기인 20씩 가다가 마지막 13byte만 보내짐
		
		is.close();
		os.close();
		
		System.out.println("복사 완료");
	}
}
