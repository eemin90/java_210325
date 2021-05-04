package p18.textbook.exercise.ex07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String path = "src/p18/textbook/exercise/ex07/AddLineNumberExample.java";
		Reader rd = new FileReader(path);
		BufferedReader br = new BufferedReader(rd);
		
		String line = "";
		
		int lineNum = 0;
		while ((line = br.readLine()) != null) {
			System.out.println((++lineNum) + ": " + line);			
		}
		
		br.close();
		rd.close();
	}
}
