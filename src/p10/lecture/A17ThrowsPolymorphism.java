package p10.lecture;

import java.io.FileInputStream;

public class A17ThrowsPolymorphism {
	public static void main(String[] args) throws Exception {
		method1();
	}
	
	private static void method1() throws Exception {
		Class.forName("java.lang.String");
		FileInputStream file = new FileInputStream("");
	}
}
