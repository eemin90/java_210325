package p04.lecture;

public class A16While {
	public static void main(String[] args) {
		// 조건이 true면 코드블럭 실행
		//       false이면 다음 실행 흐름
		
		int a = 5;
		
		while (a > 0) {
			System.out.println("코드블록 내 명령문");
			a--;
		}
		
		System.out.println("프로그램 종료");
	}
}
