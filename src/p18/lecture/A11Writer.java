package p18.lecture;

import java.io.FileWriter;
import java.io.Writer;

public class A11Writer {
	public static void main(String[] args) throws Exception {
		String file = "src/p18/lecture/output3.txt";
		Writer wt = new FileWriter(file);
		
		char c = '가';
		
		wt.write(c);
		wt.write('나');
		wt.write(new char[] {'다', '라', '마'});
		wt.write(new char[] {'바', '사', '아'}, 0, 2);
		wt.write("자바");
		wt.write("스프링프레임워크", 3, 5);
		
		wt.close();
	}
}
