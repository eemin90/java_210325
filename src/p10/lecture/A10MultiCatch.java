package p10.lecture;

public class A10MultiCatch {
	public static void main(String[] args) {
		
		try {
			String[] arr1 = {"300", "abc"};
			int i = Integer.parseInt(arr1[2]);
		} catch(NumberFormatException e) {
			System.out.println("숫자 형식이 바르지 않습니다.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 참조가 잘못 되었습니다.");
		} finally {
			System.out.println("항상 실행됨");
		}
		
		System.out.println("프로그램 종료");
	}
}
