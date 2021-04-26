package p13.lecture;

public class A01Generic {
	// generic type: 타입 파라미터를 가진 타입
	// 타입파라미터명 작성 규칙(관습): 대문자 1개
	
	public static void main(String[] args) {
		GenericType1<Object> g1 = new GenericType1<Object>();
		GenericType1<String> g2 = new GenericType1<String>();
		GenericType1<Number> g3 = new GenericType1<>();
	}
}

class GenericType1<T> {
	
}

interface GenericInterface1<T, S, U> {
	
}
