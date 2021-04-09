package p06.lecture.p8access_modifier;

public class A01AccessModifier {
	// access modifier(접근 지정자, 접근 제한자)
	// : 정의된 요소가 어디까지 접근 가능한지 명시
	
	//								전체	상속	패키지	자기자신
	// public						 o		 o		  o		   o
	// protected					 x		 o		  o		   o
	// (package private, default)	 x		 x		  o		   o
	// private						 x		 x		  x		   o
}
