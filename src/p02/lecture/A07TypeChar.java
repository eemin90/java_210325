package p02.lecture;

public class A07TypeChar {
	public static void main(String[] args) {
		// char: 2byte(16bit) 문자 저장
		
		// javascript
		// var a = "a";
		// a = "가";
		
		// java 문자열
		String s1 = "hello"; // 큰 따옴표 String literal
		s1 = "자바";
		s1 = "자";
		s1 = "a";
		s1 = "";
		
		// java 문자
		char charVar;
//		charVar = "a"; // not ok
		charVar = 'a'; // 작은 따옴표 char literal
		charVar = '눈';
		System.out.println(charVar); // 눈
		charVar = '\uB208'; // 여기서 '\ u'는 유니코드라는 의미
		System.out.println(charVar); // 눈
		charVar = 45576; // 직접 유니코드 정수값도 저장 가능
		System.out.println(charVar); // 눈
	}
}
