package p11.textbook.s110702;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-1230123";

		char sex = ssn.charAt(7);

		switch (sex) {
		// 1이거나 3이면
		case '1':
		case '3':
			System.out.println("남자 입니다");
			break;
		// 2이거나 4이면
		case '2':
		case '4':
			System.out.println("여자 입니다");
			break;
		}
	}
}
