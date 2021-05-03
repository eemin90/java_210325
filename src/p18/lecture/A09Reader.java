//p한글
package p18.lecture;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

public class A09Reader {
	public static void main(String[] args) throws Exception {
		String file = "src/p18/lecture/A09Reader.java";
		InputStream is = new FileInputStream(file); // 1byte를 읽기 때문에 한글이 깨짐(그림, 멀티미디어, 영문자 등 특화)
		
		System.out.println((char) is.read());
		System.out.println((char) is.read());
		System.out.println((char) is.read());
		System.out.println((char) is.read());
		System.out.println();
		
		is.close();
		
		Reader rd = new FileReader(file); // Reader는 2byte를 읽기 때문에 잘 나옴(문자 특화)
		
		System.out.println((char) rd.read());
		System.out.println((char) rd.read());
		System.out.println((char) rd.read());
		System.out.println((char) rd.read());
		
		rd.close();
	}
}
