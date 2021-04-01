package p04.textbook.exercise;

public class Exercise03 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 3; i <= 100; i += 3) {
			sum += i;
		}

		System.out.println("3의 배수의 합: " + sum);
	}
}
