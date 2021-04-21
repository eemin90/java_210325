package p06.lecture.paAnnotation;

public class A01Annotation {
	// annotation: 메타 데이터(부가 정보)
	// 컴파일러 | 다른 프로그램에게 정보를 줌
		
	// 예: Override
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@MyAnnotation1
	public void method1() {
		
	}
}
