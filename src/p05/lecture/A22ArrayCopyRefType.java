package p05.lecture;

import java.util.Arrays;

public class A22ArrayCopyRefType {
	public static void main(String[] args) {
		String[] s = {"java", "abc"};
		String[] t = new String[2];
		
		System.arraycopy(s, 0, t, 0, 2);
		t[0] = "jav";
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(t));
	}
}
