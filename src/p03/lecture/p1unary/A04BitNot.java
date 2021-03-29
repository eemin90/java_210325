package p03.lecture.p1unary;

public class A04BitNot {
	public static void main(String[] args) {
		// 비트 반전 : ~
		// 0 --> 1, 1 --> 0
		
		int a = 99; // 2진법 : 0000 .... 0000 0110 0011
		int b = ~a; //         1111 .... 1111 1001 1100
		
		System.out.println(a);
		System.out.println(b);
	}
}
