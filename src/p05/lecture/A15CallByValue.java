package p05.lecture;

public class A15CallByValue {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		
		System.out.println(arr1[0]); // 0
		arr1[0] = 99;
		System.out.println(arr1[0]); // 99
		
		method1(arr1); // method1로 인하여 arr1의 0번 index의 값이 99에서 5000으로 변경됨
		System.out.println(arr1[0]); // 5000
	}
	
	public static void method1(int[] arr) {
		arr[0] = 5000;
	}
}
