package p03.lecture.p1unary;

public class A03LogicalNot {
	public static void main(String[] args) {
		// 논리 부정 연산자(logical not)
		// ! : 피연산자가 boolean 타입
		//     연산의 결과는 true -> false
		//                  false -> true
		
		boolean b = true;
		boolean c = !b;
		System.out.println(c); // false
		
		boolean d = !c;
		System.out.println(d); // true
	}
}
