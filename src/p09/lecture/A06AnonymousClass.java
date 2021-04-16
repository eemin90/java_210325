package p09.lecture;

public class A06AnonymousClass {
	public static void main(String[] args) {
		int localVar = 3;
		
//		args = new String[] {};
		
		MyInterface i1 = new MyInterface() {
			void method() {
				System.out.println(localVar);
				System.out.println(args);
			}
		};
	}
}
