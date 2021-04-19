package p10.lecture;

public class A03ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		System.out.println("프로그램 실행");
		
		int[] arr1 = {3, 4, 5};
		int[] arr2 = {8, 9};
		
		System.out.println("arr1의 마지막 값: " + arr1[2]);
		System.out.println("arr2의 마지막 값: " + arr2[2]);
		
		System.out.println("프로그램 종료");
	}
}
