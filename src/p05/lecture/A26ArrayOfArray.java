package p05.lecture;

import java.util.Arrays;

public class A26ArrayOfArray {
	public static void main(String[] args) {
		int[][] arr = new int[2][]; // 2행 짜리
		
		System.out.println(arr.length);
		for (int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
		
		// 각 원소 할당
		arr[0] = new int[3]; // 1행을 3열로
		arr[1] = new int[2]; // 2행을 2열로
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		
		for (int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
	}
}
