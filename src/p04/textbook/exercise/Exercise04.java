package p04.textbook.exercise;

public class Exercise04 {
	public static void main(String[] args) {
		while (true) {
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			int result = dice1 + dice2;
			
			if (result == 5) {
				System.out.println("(" + dice1 + ", " + dice2 + ")");
				System.out.println("두 주사위의 합이 5입니다.");
				break;
			}
			
			System.out.println("(" + dice1 + ", " + dice2 + ")");
		}
		
		System.out.println("프로그램 종료");
		
//		int d1 = 0;
//		int d2 = 0;
//
//		do {
//			
//			d1 = (int) (Math.random() * 6) + 1;
//			d2 = (int) (Math.random() * 6) + 1;
//
//			System.out.println("(" + d1 + ", " + d2 + ")");
//			
//		} while ((d1 + d2) != 5);
	}
}
