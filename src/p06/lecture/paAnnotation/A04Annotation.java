package p06.lecture.paAnnotation;

public class A04Annotation {
	@MyAnnotation3(999)
	public void method1() {}
	
	@MyAnnotation3(value = 999)
	public void method2() {}
	
	@MyAnnotation3(value = 999, attr1 = 123)
	public void method3() {}
}
