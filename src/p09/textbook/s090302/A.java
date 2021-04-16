package p09.textbook.s090302;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	// 인스턴스 멤버 클래스(B) 안에서는 바깥 클래스의 모든 필드와 메소드에 접근 가능
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	// 정적 멤버 클래스(C) 안에서는 바깥 클래스의 정적 필드(field2)와 정적 메소드(method2())에만 접근 가능
	static class C {
		void method() {
//			field1 = 10;
//			method1();
			
			field2 = 10;
			method2();
		}
	}
}
