package p09.lecture;

public class A07AnonymousClass {
	// 필드
	MyInterface o1 = new MyInterface() {
		
	};
	
	// 메소드
	void method2() {
		// 매개값에도 사용 가능
		method(new MyInterface() {
			
		});
	}
	
	void method(MyInterface o) {
		
	}
}
