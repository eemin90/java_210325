package p05.lecture;

import java.util.Arrays;

public class A17ArrayInitValue {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		
		int[] arr2 = new int[] {5, 6, 7, 8};
		
		int[] arr3;
		arr3 = new int[] {40, 30, 20};
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}
}
