package p04.textbook.exercise;

import java.io.IOException;
import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) throws IOException {
		boolean run = true;
		
		int select = 0;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			if (select != 13 && select != 10) {
				System.out.println("---------------------------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("---------------------------------");
				System.out.print("선택> ");
			}
			
			select = System.in.read();
			
			if (select == 49) {
				System.out.print("예금액> ");
				balance += scanner.nextInt();
				System.out.println();
			} else if (select == 50) {
				System.out.print("출금액> ");
				balance -= scanner.nextInt();
				System.out.println();
			} else if (select == 51) {
				System.out.print("잔고> " + balance);
				System.out.println();
				System.out.println();
			} else if (select == 52) {
				run = false;
			}
		}
		
		scanner.close();
		System.out.println("프로그램 종료");
	}
}
