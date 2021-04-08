package p06.lecture.p4method;

import java.util.Arrays;

public class MyClass5 {
	void method1() {
		System.out.println("method1~~");
	}
	
	// 파라미터, 매개변수
	void method2(int a) {
		System.out.println("method2!!");
		System.out.println("param a : " + a);
	}
	

	void method3(int a, int b) {
		System.out.println("method3###");
		System.out.println("param a : " + a);
		System.out.println("param b : " + b);
	}
	
	void method4(int[] a) {
		System.out.println("method4$$$");
		System.out.println("param a : " + Arrays.toString(a));
		a[0] = 999;
	}
}
