package p05.lecture;

public class A06StringEquals {
	public static void main(String[] args) {
		String s = new String("java");
		String t = "java";
		String u = "java";
		
		boolean b1 = s.equals(t);
		System.out.println(s == t); // false 참조가 다름
		System.out.println(b1); // true 문자열이 같음
		
		System.out.println(s.equals(s)); // true
		System.out.println(t.equals(u)); // true 참조가 같음
	}
}
