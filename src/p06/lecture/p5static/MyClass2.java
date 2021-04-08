package p06.lecture.p5static;

public class MyClass2 {
	static int i; // class field(static field)
	
	int j; // instance field
	
	// class method(static method)
	static void method() {
		System.out.println("method()");
	}
	
	// instance method
	void method1() {
		System.out.println("method1()");
	}
}
