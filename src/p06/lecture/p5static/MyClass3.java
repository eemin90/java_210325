package p06.lecture.p5static;

public class MyClass3 {
	int i;
	static int j;
	
	static void method1() {
		System.out.println("method1");
		method3();
		
		// 스태틱 멤버는 인스턴스 멤버에 접근 불가능
//		method2();
//		System.out.println(i);
	}
	
	void method2() {
		System.out.println("method2");
		this.method4();
		System.out.println(i);
		
		// 인스턴스 멤버는 스태틱 멤버에 접근 가능
		method3();
		System.out.println(j);
	}
	
	static void method3() {
		System.out.println("method3");
	}
	
	void method4() {
		System.out.println("method4");
	}
}
