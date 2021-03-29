package p11.lecture.string;

public class A02Length {
	public static void main(String[] args) {
		String str1 = "java servlet spring";
		int s1 = str1.length();
		System.out.println(s1);
		
//		String s2 = str1.substring(18, 19);
//		String s2 = str1.substring(s1 - 1);
		String s2 = str1.substring(s1 - 1, s1);
		System.out.println(s2);
	}
}
