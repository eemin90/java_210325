package p03.lecture.p2binary.arithmetic;

public class A04DivideZero {
	public static void main(String[] args) {
		// 정수는 0으로 나눌 수 없음
		int a = 3;
		int b = 0;
		
//		int c = a / b; // ArithmeticException 발생
//		System.out.println(c);
		
		// 실수는 0으로 나누면 무한대
		double x = 3.0;
		double y = 0.0;
		
		double z = x / y;
		System.out.println(z);
		
		double w = z - 3.14;
		System.out.println(w);
		
		// 실수의 0으로 나눈 나머지는 NaN
		double e = 5.0;
		double f = 0.0;
		
		double g = e % f;
		System.out.println(g);
		
		double h = g + 3.14;
		System.out.println(h);
	}
}
