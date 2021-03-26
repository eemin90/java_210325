package p02.lecture;

public class A11TypeConversion {
	public static void main(String[] args) {
		// 정수: byte, short, int, long
		
		// 자동 형변환
		byte byteVar1 = 100;
		short shortVar1 = byteVar1;
		int intVar1 = shortVar1;
		intVar1 = byteVar1;
		
		long longVar1 = intVar1;
		longVar1 = shortVar1;
		longVar1 = byteVar1;
		
		//
		int intVar2 = 100;
		short shortVar2 = 100;
//		shortVar2 = intVar2; // short은 2byte라서 4byte인 int값을 담을 수 없다!
		
		// 강제 형변환(Type Casting) (Casting이라고도 함)
		shortVar2 = (short) intVar2;
		System.out.println(shortVar2);
		intVar2 = 200000000;
		shortVar2 = (short) intVar2;
		System.out.println(shortVar2); // intVar2의 리터럴 값을 short(2byte)에 담기에는 값이 커서 값이 손실된다		
	}
}
