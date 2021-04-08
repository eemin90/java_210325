package p06.lecture.p4method;

import java.util.Arrays;

public class MyClass7 {
	void method1(int i) {
		System.out.println("method1~");
		System.out.println(i);
	}
	
	void method2(int i, int j) {
		System.out.println("method2~");
		System.out.println(i + ", " + j);
	}
	
	// variable argument type (...)
	// 매개 변수의 갯수를 모를 경우 사용
	void method3(int ... i) {
		System.out.println("method3");
		System.out.println(i.length);
		System.out.println(Arrays.toString(i));
	}
	
	// 다른 파라미터와 같이 쓰이게 된다면 항상 맨 뒤에 있어야 함
	void method4(double d, String s, int ... i) {
		
	}
}
