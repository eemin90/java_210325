package p18.lecture;

import java.io.FileInputStream;
import java.io.InputStream;

public class A03InputStream {
	public static void main(String[] args) throws Exception {
		String fileName = "src/p18/lecture/A02InputStream.java";
		InputStream is = new FileInputStream(fileName);
		
		byte[] datas = new byte[10];
		
//		int cnt = is.read(datas);
//		
//		System.out.println(datas[0]);
//		System.out.println(datas[1]);
//		System.out.println(datas[2]);
		
		int cnt = 0;
		while ((cnt = is.read(datas)) != -1) {
			System.out.println(cnt); // 593byte 파일을 배열크기가 10인 datas로 읽어오니까
		}							 // 10씩 가다가 끝에 3이 남게되어 마지막은 3이 출력
		
		is.close();
	}
}
