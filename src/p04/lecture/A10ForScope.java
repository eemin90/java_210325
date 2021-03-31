package p04.lecture;

public class A10ForScope {
	public static void main(String[] args) {
		int a = 10;
		
		System.out.println(a);
		
		int i;
		for (i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println(i);
	}
}
