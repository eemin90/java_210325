package p11.lecture.wrapper;

public class A03Parsing {
	public static void main(String[] args) {
		String s1 = "999";
		String s2 = "3.14";
		String s3 = "true";

		// 문자열을 기본 타입 값으로 변환
		int i1 = Integer.parseInt(s1);
		double d1 = Double.parseDouble(s2);
		boolean b1 = Boolean.parseBoolean(s3);

		System.out.println(i1);
		System.out.println(d1);
		System.out.println(b1);
	}
}
