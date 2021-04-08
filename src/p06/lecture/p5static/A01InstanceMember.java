package p06.lecture.p5static;

public class A01InstanceMember {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
		o1.i = 3;
		o1.method();
		
		MyClass1 o2 = new MyClass1();
		o2.i = 5;
		o2.method();
		
		System.out.println(o1.i);
		System.out.println(o2.i);
	}
}
