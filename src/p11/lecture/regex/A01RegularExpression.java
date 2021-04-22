package p11.lecture.regex;

import java.util.regex.Pattern;

public class A01RegularExpression {
	// 정규 표현식
	// 문자열의 패턴을 표현하는 문자열
	// meta-character, quantifier

	public static void main(String[] args) {
		String regex1 = "a";
		String str1 = "a";

		// 문자열을 정규 표현식으로 검증(Pattern.matches("정규식", "검증할 문자열")
		// return true or false(boolean type)
		boolean p1 = Pattern.matches(regex1, str1);
		System.out.println(p1);

		regex1 = "java";
		str1 = "java";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "9";
		str1 = "0";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d"; // 숫자 1개
		str1 = "8";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d"; // 숫자 1개
		str1 = "89";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d\\d"; // 숫자 2개
		str1 = "67";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d{3}"; // 숫자 3개
		str1 = "876";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d{3,}"; // 숫자 3개 이상
		str1 = "8264";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "010-\\d{4}-\\d{4}"; // 010-(숫자 4개)-(숫자 4개)
		str1 = "010-1234-5678";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d{3,5}"; // 숫자 3개 이상 5개 이하
		str1 = "83525";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d+"; // 1개 이상("\\d{1,}")
		str1 = "81";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d*"; // 0 또는 1개 이상("\\d{0,}")
		str1 = "8";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d?"; // 0 또는 1개("\\d{0,1}")
		str1 = "12";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "010-?\\d{4}-?\\d{4}"; // 010 + "-"가 0 또는 1개 + 숫자 4개 + "-"가 0 또는 1개 + 숫자 4개
		str1 = "010-1234-5678";
		String str2 = "01012345678";
		String str3 = "010-12345678";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		
		regex1 = "\\w"; // 알파벳 1개 또는 숫자 1개, 언더바 "_" 포함
		str1 = "s";
		str2 = "T";
		str3 = "8";
		String str4 = "_";
		String str5 = " ";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		System.out.println(Pattern.matches(regex1, str5));
		
		regex1 = "\\w\\d+"; // 알파벳 1개 또는 숫자 1개, 언더바 "_" 포함 + 숫자 1개 이상
		str1 = "s362346";
		str2 = "_123524352";
		str3 = "143623462";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		
		regex1 = "(java)"; // "java"
		str1 = "java";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "(java)+"; // "java" 1개 이상
		str1 = "javajava";
		str2 = "javajavaja";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		
		regex1 = "(java|python)"; // "java" 또는 "python"
		str1 = "java";
		str2 = "python";
		str3 = "spring";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		
		regex1 = "(java|python)+"; // "java" 또는 "python" 1개 이상
		str1 = "java";
		str2 = "python";
		str3 = "pythonjavajavapython";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		
		regex1 = "."; // 아무 문자 중 1개
		str1 = "$";
		str2 = ".";
		str3 = "ㅋ";
		str4 = "9";
		str5 = "=";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		System.out.println(Pattern.matches(regex1, str5));
		
		regex1 = "[abc]"; // a, b, c 중 하나의 문자
		str1 = "a";
		str2 = "b";
		str3 = "t";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		
		regex1 = "[^abc]"; // a, b, c 이외의 하나의 문자
		str1 = "a";
		str2 = "b";
		str3 = "t";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		
		regex1 = "[a-zA-Z]"; // a~z, A~Z 중 하나의 문자
		str1 = "a";
		str2 = "A";
		str3 = "t";
		str4 = "T";
		str5 = "9";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		System.out.println(Pattern.matches(regex1, str5));
		
		regex1 = "[가-힣]+"; // 한글 1개 이상(자음, 모음 개별로는 안됨)
		str1 = "각";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\p{IsHangul}+"; // 한글 1개 이상(자음, 모음 개별로도 가능)
		str1 = "각ㄱㄱ";
		System.out.println(Pattern.matches(regex1, str1));
	}
}
