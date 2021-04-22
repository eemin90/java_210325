package p11.textbook.ex10;

import java.util.regex.Pattern;

public class PatternMatcherExample {
	public static void main(String[] args) {
		String id = "5Angel1004";
		// 첫 번째는 알파벳으로 시작하고, 두 번째부터 숫자와 알파벳으로 구성된 8~12자 사이의 ID값 검사
//		String regExp = "[a-zA-Z]\\w{7,11}";
		String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";
		
		boolean isMatch = Pattern.matches(regExp, id);
		
		if (isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
		} else {
			System.out.println("ID로 사용할 수 없습니다.");
		}
	}
}
