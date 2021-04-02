package p05.lecture;

public class A14CallByValue {
	public static void main(String[] args) {
		int i = 3;
		int j = 5;
		
		method1(i);
		method1(j);
		
		int[] arr1 = new int[3];
		int[] arr2 = new int[5];
		
		method2(arr1);
		method2(arr2);
		method2(new int[] {4, 2});
	}
	
	public static void method1(int i) {
		System.out.println(i);
	}
	
	public static void method2(int[] arr) {
		System.out.println(arr.length);
	}
}
