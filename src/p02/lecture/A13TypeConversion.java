package p02.lecture;

public class A13TypeConversion {
	public static void main(String[] args) {
		// int: 4byte(32bit)
		// float: 4byte(32bit)
		
		// float의 저장법
		// 부호 1bit
		// 지수 8bit
		// 가수 23 bit
		// 0000 0000 0000 0000 0000 0000 0000 0000
		
		int intVar1 = 66977791;
		float floatVar1 = intVar1;
		
		System.out.println(floatVar1);
		
		// double의 저장법
		// 부호 1bit
		// 지수 11bit
		// 가수 52bit
		
		double doubleVar1 = intVar1;
		System.out.println(doubleVar1);
	}
}
