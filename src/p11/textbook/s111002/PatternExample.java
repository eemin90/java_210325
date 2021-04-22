package p11.textbook.s111002;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		// (02 또는 010) + "-" + 숫자 3~4개 + "-" + 숫자 4개
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";

		boolean result = Pattern.matches(regExp, data);

		if (result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}

		System.out.println();
		
		// 알파벳 또는 숫자 1개 이상 + "@" + 알파벳 또는 숫자 1개 + "." + 알파벳 또는 숫자 1개 이상 + ("." + 알파벳 또는 숫자 1개 이상)이 없거나 1개
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@naver.co.kr";
		String data1 = "angel@naver.com";

		result = Pattern.matches(regExp, data);
		boolean result1 = Pattern.matches(regExp, data1);

		if (result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		if (result1) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}
}
