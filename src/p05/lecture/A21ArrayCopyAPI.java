package p05.lecture;

import java.util.Arrays;

public class A21ArrayCopyAPI {
	public static void main(String[] args) {
		// System.arraycopy(p1, p2, p3, p4, p5);
		// p1 : 원본 배열
		// p2 : 원본 배열의 시작 index
		// p3 : 복사본 배열
		// p4 : 복사본 배열의 시작 index
		// p5 : 길이
		
		int[] arr1 = {9, 7, 5, 3, 1};
		int[] arr2 = new int[10];
		
		// 복사 전
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		// 복사
//		System.arraycopy(arr1, 0, arr2, 0, 5);
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		// 복사 후
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}
