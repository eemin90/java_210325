package p04.lecture;

import java.util.Scanner;

public class A05IfSampleScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력>");
		String str = scanner.nextLine(); // String
		
		System.out.println("출력>");
		System.out.println(str);
		
		System.out.println("숫자 입력>");
		int in = scanner.nextInt();
		
		System.out.println("숫자 출력>");
		System.out.println(in);
	}
}
