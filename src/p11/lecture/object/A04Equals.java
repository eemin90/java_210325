package p11.lecture.object;

public class A04Equals {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1 == o2);
		System.out.println(o1.equals(o2));
		
		System.out.println(o1.equals(o1));
		
		String s1 = "java";
		String s2 = new String("java");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
