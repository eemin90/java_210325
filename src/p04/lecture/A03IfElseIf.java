package p04.lecture;

public class A03IfElseIf {
	public static void main(String[] args) {
		// else if : if (또는 else if)의 조건이 false일 때 새로운 조건을 확인하여 실행

		int a = 50;

		System.out.println("statement1");

		if (a > 100) {
			System.out.println("statement2");
		} else if (a > 0) {
			System.out.println("statement3");
		} else if (a > -50) {
			System.out.println("statement3.1");
		} else if (a > -100) {
			System.out.println("statement3.2");
		} else {
			System.out.println("statement3.3");
		}

		System.out.println("statement4");
	}
}
