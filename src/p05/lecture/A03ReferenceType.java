package p05.lecture;

public class A03ReferenceType {
	public static void main(String[] args) {
		int i = 3;
		int j = 3;
		
		String s = new String("java");
		String t = new String("java");
		
		System.out.println(i == j); // true
		System.out.println(s == t); // false
	}
}
