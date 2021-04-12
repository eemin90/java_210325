package p07.lecture.p3method_override;

public class A01MethodOverride {
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.method1();
		
		Parent p1 = new Parent();
		p1.method1();
	}
}
