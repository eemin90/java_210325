package p03.lecture.p2binary.p4bit;

public class A01Bit {
	public static void main(String[] args) {
		// and & : 같은 자리의 비트가 둘 다 1이면 1, 나머지 0
		// or | : 같은 자리의 비트가 하나라도 1이면 1 , 나머지 0
		// xor ^ : 같은 자리의 비트 중 하나는 1이고 다른 하나가 0일 경우 1, 나머지 0
		// not ~ : 0 --> 1, 1 -->0
		
		// and &
		int a = 99;  // 2진법 : 00 0110 0011
		int b = 999; // 2진법 : 11 1110 0111
		
		// and &     // 2진법 : 00 0110 0011
		int c = a & b;
		System.out.println(c);
		
		// or |
		c = a | b;   // 2진법 : 11 1110 0111
		
		// xor ^
		c = a ^ b;   // 2진법 : 11 1000 0100
		
	}
}
