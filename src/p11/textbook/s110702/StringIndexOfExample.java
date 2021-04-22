package p11.textbook.s110702;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";

		int location = subject.indexOf("프로그래밍");
		System.out.println(location);

		// "자바"라는 문자열이 포함되어 있을때와 포함되지 않았을 때 각각 출력
		if (subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}
	}
}
