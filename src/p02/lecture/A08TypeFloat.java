package p02.lecture;

public class A08TypeFloat {

	public static void main(String[] args) {
		// float: 4byte(32bit) 실수 저장
		
		long longVar = 220000000000L;
		
		float var;
		var = 3.14F; // 실수 literal은 double(8byte)

		// 최대값
		System.out.println(Float.MAX_VALUE);
		
		// 최소값
		System.out.println(Float.MIN_VALUE);
		
		// 음수 최소값
		System.out.println(-Float.MAX_VALUE);
		
		// 음수 최대값
		System.out.println(-Float.MIN_VALUE);
		
		// 양의 무한대
		System.out.println(Float.POSITIVE_INFINITY);
		
		// 음의 무한대
		System.out.println(Float.NEGATIVE_INFINITY);
		
		// NaN (Not a Number)
		System.out.println(Float.NaN);
	}

}
