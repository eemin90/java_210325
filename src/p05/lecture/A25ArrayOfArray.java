package p05.lecture;

import java.util.Arrays;

public class A25ArrayOfArray {
	public static void main(String[] args) {
		// 다차원 배열(배열의 배열)
		int[][] arr = new int[2][3];
		arr[1][1] = 9;
		arr[0][2] = 8;
		
		for (int[] elem : arr) {
			System.out.println(Arrays.toString(elem));
		}
	}
}
