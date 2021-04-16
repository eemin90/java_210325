package p09.lecture;

public class A02LocalClass {
	// 인스턴스 멤버 클래스
	class InnerClass {
		
	}
	
	// 정적 멤버 클래스
	static class StaticClass {
		
	}
	
	void method1() {
		// 로컬 클래스
		class LocalClass {
			// 필드
			// 생성자
			// 메소드
		}
		
		LocalClass o1 = new LocalClass();
	}
}
