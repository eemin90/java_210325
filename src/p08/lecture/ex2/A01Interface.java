package p08.lecture.ex2;

public class A01Interface {
	public static void main(String[] args) {
		System.out.println(MyInterface.MY_FIELD1);
		System.out.println(MyInterface.MY_FIELD2);
		System.out.println(MyInterface.MY_FIELD3);
		
		MyInterface.staticMethod1();
		MyInterface.staticMethod2();
		
		MyClass c1 = new MyClass();
		c1.method1();
		c1.method2();
		
		c1.defaultMethod1();
		c1.defaultMethod2();
	}
}
