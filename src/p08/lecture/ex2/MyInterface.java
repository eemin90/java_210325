package p08.lecture.ex2;

public interface MyInterface {
	// static final 필드
	public static final int MY_FIELD1 = 1;
	int MY_FIELD2 = 2; // 생략해도 같음(public static final)
	String MY_FIELD3 = "hello";
	
	// public static 메소드(클래스 메소드)
	public static void staticMethod1() {
		System.out.println("static method1");
	}
	
	static void staticMethod2() { // 생략해도 같음(public)
		System.out.println("static method2");
	}
	
	// public abstract 메소드(인스턴스 메소드)
	public abstract void method1();
	void method2(); // 생략해도 같음(public abstract)
	
	// public default 메소드(인스턴스 메소드)
	public default void defaultMethod1() {
		System.out.println("default method1");
	}
	
	default void defaultMethod2() { // 생략해도 같음(public)
		System.out.println("default method2");
	}
}
