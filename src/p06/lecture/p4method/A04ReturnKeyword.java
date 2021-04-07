package p06.lecture.p4method;

public class A04ReturnKeyword {
	// return : 1.메소드 종료
	//			2. 오른쪽에 있는 값 반환(return)
	
	// 오른쪽에 명시된 값은 메소드명 앞의 타입과 일치해야 함
	public static void main(String[] args) {
		MyClass4 c1 = new MyClass4();
		c1.method1();
		int a = c1.method2();
		String b = c1.method3();
		int[] c = c1.method4();
		int[] d = c1.method5();
		String e = c1.method6();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c.length);
		System.out.println(d.length);
		System.out.println(e);
	}
}
