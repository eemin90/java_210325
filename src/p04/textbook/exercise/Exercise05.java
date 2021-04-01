package p04.textbook.exercise;

public class Exercise05 {
	public static void main(String[] args) {
		int x;
		int y;
		
		for (x = 2; x <= 10; x++) {
			for (y = 2; y <= 10; y++) {
				if ((4 * x) + (5 * y) == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
	}
}
