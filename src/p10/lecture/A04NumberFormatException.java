package p10.lecture;

public class A04NumberFormatException {
	public static void main(String[] args) {
		System.out.println("프로그램 종료");
		
		String str1 = "100a";
		
		int int1 = Integer.parseInt(str1);
		
		int result = int1 * 2;
		
		System.out.println(result);
		
		System.out.println("프로그램 종료");
	}
}
