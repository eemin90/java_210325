package p05.lecture;

import java.util.Arrays;

public class A29ArraySum {
	public static void main(String[] args) {
		int[] arr1 = {3, 4, 5, 6, 7, 8};
		int[] arr2 = {11, 22, 33, 44, 55, 66};
		int[] arr3 = new int[6];
		
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr1[i] + arr2[i];
		}
		
		System.out.println(Arrays.toString(arr3));
	}
}
