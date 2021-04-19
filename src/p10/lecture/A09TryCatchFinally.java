package p10.lecture;

public class A09TryCatchFinally {
	public static void main(String[] args) {
		System.out.println("프로그램 실행");
		
		try {
			System.out.println("try 실행");
			
			int[] arr1 = {2, 3, 4};
			System.out.println(arr1[3]);
			
			System.out.println("try 종료");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("catch 실행");
			
			System.out.println(e.getMessage());
			
			System.out.println("catch 종료");
		} finally {
			System.out.println("finally 블럭은 항상 실행됨");
		}
		
		System.out.println("프로그램 종료");
	}
}
