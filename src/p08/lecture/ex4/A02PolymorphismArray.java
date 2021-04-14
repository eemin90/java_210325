package p08.lecture.ex4;

public class A02PolymorphismArray {
	public static void main(String[] args) {
		CharSequence[] cs = new CharSequence[3];
		cs[0] = new String("abc");
		cs[1] = new StringBuffer("java");
		cs[2] = new StringBuilder("spring");
		
		System.out.println(cs[0].length());
		System.out.println(cs[1].length());
		System.out.println(cs[2].length());
	} 
}
