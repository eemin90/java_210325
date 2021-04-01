package p05.lecture;

public class A04ReferenceType {
	public static void main(String[] args) {
		int i = 3;
		int j = i;
		
		String s = new String("java");
		String t = s;
		
		System.out.println(i == j); // 값을 그대로 받아오기 때문에 true
		System.out.println(s == t); // 주소값을 그대로 받아오기 때문에 true
	}
}
