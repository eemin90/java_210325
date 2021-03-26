package p02.textbook;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; // int(4byte) <-- byte(1byte) // ok
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue; // int(4byte) <-- char(2byte) // ok but get unicode number
		System.out.println("'가'의 유니코드=" + intValue);
		
		intValue = 500;
		long longValue = intValue; // long(8byte) <-- int(4byte) // ok
		System.out.println(longValue);;
		
		intValue = 200;
		double doubleValue = intValue; // double(8byte) <-- int(4byte) // ok
		System.out.println(doubleValue);		
	}
}
