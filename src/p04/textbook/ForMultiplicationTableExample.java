package p04.textbook;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
//		for (int m = 2; m <= 9; m++) {
//			System.out.println("*** " + m + "단 ***");
//			for (int n = 1; n <= 9; n++) {
//				System.out.println(m + " x " + n + " = " + (m * n));
//			}
//		}
		
		// 2 ~ 9단 짝수단
//		for (int i = 2; i <= 9; i += 2) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + " x " + j + " = " + (i * j));
//			}
//		}
		
		// 2 ~ 9단 짝수 곱만
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 2; j <= 9; j += 2) {
//				System.out.println(i + " x " + j + " = " + (i * j));
//			}
//		}
		
		// 9 ~ 2단 (9*1 ~ 9*9 ... 2*9)
//		for (int i = 9; i >= 2; i--) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + " x " + j + " = " + (i * j));
//			}
//		}
		
		
		// 9 ~ 2단 (9*9 ~ 9*1 ... 2*1)
//		for (int i = 9; i >= 2; i--) {
//			for (int j = 9; j >= 1; j--) {
//				System.out.println(i + " x " + j + " = " + (i * j));
//			}
//		}
	}
}
