package p02.lecture;

public class A03TypeByte {
	public static void main(String[] args) {
		// byte: 1byte 크기의 정수를 저장할 수 있음
		// 1byte == 8bit
		// 0000 0000 ~ 1111 1111
		
		// 10진법 0 == 2진법 0000 0000
		// 10진법 1 == 2진법 0000 0001
		// 10진법 2 == 2진법 0000 0010
		// 10진법 3 == 2진법 0000 0011
		// 10진법 4 == 2진법 0000 0100
		//          :
		//          :
		//      127 ==       0111 1111
		
		//     -128 ==       1000 0000 // 맨 왼쪽 비트가 1이면 음수
		//     -127 ==       1000 0001
		//     -126 ==       1000 0010
		//          :
		//          :
		//       -1 ==       1111 1111
		//        0 ==       0000 0000
		
		// 최소값: -128
		// 최대값: 127
		
		byte byteVar;
		byteVar = -128;
		byteVar = 127;
		
//		byteVar = -129; // not ok
//		byteVar = 128; // not ok
		
	}
}
