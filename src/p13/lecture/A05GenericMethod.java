package p13.lecture;

public class A05GenericMethod {
	public static void main(String[] args) {
		MyClass5 o1 = new MyClass5();
		o1.<String>method1(); // 타입 파라미터 지정
		o1.<String>method2("java"); // 타입 파라미터 지정
		o1.method2("java"); // 타입 파라미터 추정
		
		o1.<String>method3(); // 타입 파라미터 지정
		String s = o1.method3(); // 타입 파라미터 추정
		System.out.println(s);
		
		// 추정 방식으로 많이 사용한다
	}
}

class MyClass5 {
	public <T> void method1() {
		
	}
	
	public <T> void method2(T param) {
		
	}
	
	public <T> T method3() {
		return null;
	}
}
