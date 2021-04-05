package p05.lecture;

import java.util.Arrays;

public class A20ArrayCopy {
	public static void main(String[] args) {
		int[] arr1 = {9, 7, 5, 3, 1};
		int[] arr2;
		arr2 = arr1;
		
		arr2[0] = 10;
		System.out.println(arr1[0]); // 참조가 같기 때문에 동일하게 바뀜
		
		// 배열 복사
		int[] arr3 = new int[arr1.length];
		
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr3));
		
		arr3[0] = 11;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr3)); // 참조가 다르기 때문에 값이 다름
	}
}
