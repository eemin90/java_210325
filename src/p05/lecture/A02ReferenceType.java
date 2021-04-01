package p05.lecture;

public class A02ReferenceType {
	public static void main(String[] args) {
		int i;
		i = 3;
		
		String s = "java";
		
		// String : 타입
		// s1 : (참조)변수
		// new String("java") : 객체(instance(개체), object(객체))
		String s1;
		s1 = new String("java"); // s1변수에 실제값"java"가 아닌, heap영역에 생성된 "java"라는 객체의 주소값(참조)을 저장 (s1객체 또는 s1참조변수로 불리게 됨)
		
		System.out.println(s == s1); // 보기에는 실제값이 같아보이지만, s객체와 s1객체는 각각 참조가 다름 false
		System.out.println(s.equals(s1)); // 문자열 값은 같음 true
	}
}
