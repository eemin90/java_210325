package p06.lecture.p5static;

public class MyClass4 {
	int i = 3;
	int j;
	
	static int a = 30;
	static int b;
	
	static {
		b = 50;
		System.out.println("static block");
	}
	
	MyClass4() {
		// 인스턴스 필드 초기화
		this.j = 5;
	}
}
