package p07.lecture.p4access_modifier_protected.package1;

public class Parent {
	
	public void publicMethod() {
		System.out.println("public method");
	}
	
	protected void protectedMethod() {
		System.out.println("protected method");
	}
	
	void defaultMethod() {
		System.out.println("default method");
	}
	
	private void privateMethod() {
		System.out.println("private method");
	}
}
