package p06.lecture.paAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@ForType
public class A05Annotation {
	@ForField
	@ForFieldAndMethod
	int field;
	
	@ForFieldAndMethod
	public void method1() {}
}

@Target(ElementType.TYPE)
@interface ForType {}

@Target(ElementType.FIELD)
@interface ForField {}

@Target({ ElementType.FIELD, ElementType.METHOD })
@interface ForFieldAndMethod {}
