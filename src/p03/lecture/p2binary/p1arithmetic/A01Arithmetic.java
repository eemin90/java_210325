package p03.lecture.p2binary.arithmetic;

public class A01Arithmetic {
	public static void main(String[] args) {
		// 산술 연산: +, -, *, /, %
		
		int x = 99;
		int y = 55;
		
		int res1 = x + y;
		System.out.println(res1);
		
		int res2 = x - y;
		System.out.println(res2);
		
		int res3 = x * y;
		System.out.println(res3);
		
		int res4 = x / y;
		System.out.println(res4);
		
		int res5 = x % y;
		System.out.println(res5);
		
		double res6 = x / (double) y;
		System.out.println(res6);
	}
}
