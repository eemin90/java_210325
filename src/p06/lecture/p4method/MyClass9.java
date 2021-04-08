package p06.lecture.p4method;

public class MyClass9 {
	// method overloading
	// 메소드명이 같아도 파라미터의 타입, 순서, 개수가 다르면 다른 메소드임
	// 리턴 타입은 메소드 오버로딩이랑 관련 없음
	void method() {
		System.out.println("method()");
	}
	
	void method(int i) {
		System.out.println("method(int)");
	}
	
	void method(double d) {
		System.out.println("method(double)");
	}
	
	void method(int i, int j) {
		System.out.println("method(int, int)");
	}
	
	void method(int i, String s) {
		System.out.println("method(int, String)");
	}
	
	void method(String s, int i) {
		System.out.println("method(String, int)");
	}
}
