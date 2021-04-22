package p11.textbook.s110701;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };

		String str1 = new String(bytes);
		System.out.println(str1);

		String str2 = new String(bytes, 6, 4); // bytes의 6번 인덱스부터 4개(74, 97, 118, 97)
		System.out.println(str2);
	}
}
