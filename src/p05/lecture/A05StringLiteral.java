package p05.lecture;

public class A05StringLiteral {
	public static void main(String[] args) {
		String s = new String("java");
		String t = "java"; // String t = new String("java")와 같다
		String u = "java"; // 이 경우는 t와 u객체의 주소값(참조)이 같다
		
		System.out.println(s == t); // false
		System.out.println(t == u); // true
	}
}
