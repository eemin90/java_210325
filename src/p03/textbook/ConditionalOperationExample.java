package p03.textbook;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C'); // 90점 초과는 A, 80점 초과는 B, 그 외에는 C
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}
}
