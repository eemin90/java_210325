package p02.lecture;

public class A02Scope {
	public static void main(String[] args) {
		// 변수 영역(scope)
		// 변수는 선언된 블럭({})안에서만 사용 가능
		
		int a;
//		int b;
		
		if (3 > 0) {
			int b;
			b = 3;
			System.out.println(b);
			
			if (2 > 0) {
				System.out.println(b);
			}
		}
		
//		System.out.println(b);
	}
}
