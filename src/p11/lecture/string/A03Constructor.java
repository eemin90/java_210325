package p11.lecture.string;

public class A03Constructor {
	public static void main(String[] args) {
		String str1 = "java";

		String str2 = new String("java");

		String str3 = new String(new char[] { 'j', 'a', 'v', 'a' });

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		String str4 = new String(new char[] { 106, 97, 118, 97 });

		System.out.println(str4);
	}
}
