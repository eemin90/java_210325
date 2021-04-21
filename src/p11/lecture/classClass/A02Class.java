package p11.lecture.classClass;

public class A02Class {
	public static void main(String[] args) throws Exception {
		Class c1 = Class.forName("p11.lecture.classClass.MyClass");
		
		MyClass o1 = new MyClass();
		Class c2 = o1.getClass();
		
		Class c3 = MyClass.class;
		
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getName());
		
		System.out.println(c1 == c2);
		System.out.println(c1 == c3);
	}
}
