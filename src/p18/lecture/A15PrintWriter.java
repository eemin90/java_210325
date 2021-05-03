package p18.lecture;

import java.io.PrintWriter;
import java.util.Scanner;

public class A15PrintWriter {
	public static void main(String[] args) throws Exception {
		String file = "src/p18/lecture/output5.txt";
		Scanner scanner = new Scanner(System.in);
		
		PrintWriter pw = new PrintWriter(file);
		
		String line = "";
		
		while (!line.equals("종료")) {
			System.out.print("입력> ");
			line = scanner.nextLine();
			pw.println(line);
		}
		
		pw.close();
		scanner.close();
	}
}
