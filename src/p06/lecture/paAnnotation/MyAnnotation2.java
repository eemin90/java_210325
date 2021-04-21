package p06.lecture.paAnnotation;

import p05.textbook.s050701.Week;

public @interface MyAnnotation2 {
	String value(); // element
	int attr1();
	int[] attr2();
	String[] attr3();
	Week attr4();
	
	int attr5() default 99;
	String attr6() default "java";
}
