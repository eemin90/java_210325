package p02.lecture;

public class A06TypeLong {
	public static void main(String[] args) {
		// long: 8byte(64bit)
		
		System.out.println("최대값");
		System.out.println(Long.MAX_VALUE);
		System.out.println("최소값");
		System.out.println(Long.MIN_VALUE);
		
		long longVar;
		longVar = 9223372036854775807L; // int타입의 저장범위를 넘어서는 큰 정수는 반드시
										// 소문자 l이나 대문자 L을 붙여줘야 한다. 소문자 l은 숫자 1과 혼돈하기 쉬우므로 대문자 L을 사용한다.
		longVar = -9223372036854775808L;
//		longVar = -9223372036854775809L; // not ok
//		longVar = 9223372036854775808L; // not ok
		
		longVar = 1_000_000; // 1000000
		System.out.println(longVar);
		longVar = 100_0000; // 1000000
		System.out.println(longVar);
	}
}
