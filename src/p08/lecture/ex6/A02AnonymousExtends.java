package p08.lecture.ex6;

public class A02AnonymousExtends {
	public static void main(String[] args) {
		Parent p1 = new Child();
		p1.method1();
		
		// 익명 클래스의 객체
		Parent p2 = new Parent() {
			@Override
			public void method1() {
				System.out.println("anonymous class method1");
			}
		};
		
		p2.method1();
	}
}
