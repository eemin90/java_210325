package p06.lecture.paAnnotation;

import java.lang.reflect.Method;
import java.lang.annotation.Annotation;

public class A02Annotation {
	public static void main(String[] args) throws Exception {
		Class c1 = A01Annotation.class;
		
		Method m1 = c1.getMethod("method1");
		Annotation[] annos = m1.getAnnotations();
		
		for (Annotation anno : annos) {
			if (anno.annotationType() == MyAnnotation1.class) {
				System.out.println("MyAnnotation1이 있습니다.");
			}
		}
	}
}
