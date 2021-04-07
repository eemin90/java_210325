package p06.lecture.p4method;

public class A02Variables {
	public static void main(String[] args) {
		MyClass2 c1 = new MyClass2();
		c1.method1(10);
		
		MyClass2 c2 = new MyClass2();
		c2.method1(20);
		
		System.out.println("변경 후");
		c1.a = 999;
		c2.a = 888;
		
		c1.method1(11);
		c2.method1(12);
	}
}
