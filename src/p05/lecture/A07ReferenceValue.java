package p05.lecture;

public class A07ReferenceValue {
	public static void main(String[] args) {
		String s = new String("java");
		String t = "java";
		String u = "java";
		
		int sHashcode = System.identityHashCode(s);
		int tHashcode = System.identityHashCode(t);
		int uHashcode = System.identityHashCode(u);
		System.out.println(sHashcode);
		System.out.println(tHashcode);
		System.out.println(uHashcode);
	}
}
