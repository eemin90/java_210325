package p09.lecture;

public class A03Access {
	class NonStaticClass {
		
	}
	
	static class StaticClass {
		
	}
	
	NonStaticClass o1 = new NonStaticClass();
	StaticClass o2 = new StaticClass();
	
//	static NonStaticClass o3 = new NonStaticClass();
	static StaticClass o4 = new StaticClass();
	
	void instanceMethod() {
		// 인스턴스 멤버는 정적 멤버 접근 가능
		staticMethod();
	}
	
	static void staticMethod() {
		// 정적 멤버는 인스턴스 멤버 접근 불가
//		instanceMethod();
	}
}
