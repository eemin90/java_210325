package p04.lecture;

import java.util.Scanner;

public class A17WhileSample {
	public static void main(String[] args) {
		int comNum = (int) (Math.random() * 100) + 1;
		System.out.println("comNum: " + comNum);
		
		Scanner scanner = new Scanner(System.in);
		int userNumber = 0;
		
		while (true) {
			System.out.println("컴퓨터의 수를 맞춰보세요>");
			userNumber = scanner.nextInt();
			
			if (userNumber == comNum) {
				System.out.println("맞췄습니다.\n");
				break;
			} else if (userNumber < comNum) {
				System.out.println("더 큰 수를 입력해 보세요.\n");
			} else {
				System.out.println("더 작은 수를 입력해 보세요.\n");
			}
		}
		
		scanner.close();
		System.out.println("프로그램 종료");
	}
}
