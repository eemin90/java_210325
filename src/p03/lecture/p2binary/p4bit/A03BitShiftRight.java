package p03.lecture.p2binary.p4bit;

public class A03BitShiftRight {
	public static void main(String[] args) {
		// >> : 왼쪽을 부호비트로 채움
		// >>> : 왼쪽을 0으로 채움
		
		// 1111111111111111111111111111111111111111111111111111111110011101
		int a = -99;
		
		// a >> 1
		// 1111111111111111111111111111111111111111111111111111111111001110
		System.out.println(a >> 1);
		
		// a >>> 1
		// 0111111111111111111111111111111111111111111111111111111111001110
		System.out.println(a >>> 1);
	}
}
