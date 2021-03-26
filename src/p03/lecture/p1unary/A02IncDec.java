package p03.lecture.p1unary;

public class A02IncDec {
	public static void main(String[] args) {
		// 증가 연산자
		// ++ : 변수에 1을 더한 값을 다시 변수에 할당
		
		int x = 5;
		x++;
		System.out.println(x); // 6
		
		// 감소 연산자
		// -- : 변수에 1을 뺀 값을 다시 변수에 할당
		x--;
		System.out.println(x); // 5
		
		// 연산자가 앞에 있을 때
		++x;
		System.out.println(x); // 6
		
		int y = 5 + (++x); // 5 + 7 -> 12
		System.out.println(y);
		
		// 연산자가 뒤에 있을 때
		System.out.println(x); // 7
		
		y = 5 + (x++);
		System.out.println(y); // 5 + 7 -> 12		
		System.out.println(x); // 8
	}
}
