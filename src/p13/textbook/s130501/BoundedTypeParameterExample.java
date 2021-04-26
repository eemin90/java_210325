package p13.textbook.s130501;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
//		String str = Util.compare("a", "b"); // String은 Number타입이 아님
		
		int result1 = Util.compare(10, 20); // int -> Integer 자동 박싱
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3); // double -> Double 자동 박싱
		System.out.println(result2);
	}
}
