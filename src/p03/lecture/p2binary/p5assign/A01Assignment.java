package p03.lecture.p2binary.p5assign;

public class A01Assignment {
	public static void main(String[] args) {
		// = : 오른쪽 값을 왼쪽에 할당(대입)
		int a = 3;
		
		// += : 왼쪽과 오른쪽값을 더해서 왼쪽에 할당
		a += 5;
		System.out.println(a);
		
		String s = "java";
		System.out.println(s);
		
		s += "script";
		System.out.println(s);
		
		// *= : 왼쪽과 오른쪽값을 곱해서 왼쪽에 할당
		a *= 6;
		System.out.println(a);
		
		// /= : 왼쪽값을 오른쪽으로 나눈 결과를 왼쪽에 할당
		a /= 3;
		System.out.println(a);
		
		// %= : 왼쪽값을 오른쪽으로 나눈 나머지를 왼쪽에 할당
		a %= 5;
		System.out.println(a);
	}
}
