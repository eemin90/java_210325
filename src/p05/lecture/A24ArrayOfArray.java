package p05.lecture;

import java.util.Arrays;

public class A24ArrayOfArray {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		
		int[][] arr2 = new int[2][3];
		
		System.out.println(arr2.length); // 2
		System.out.println(arr2[0].length); // 3
		System.out.println(arr2[1].length); // 3
		System.out.println();
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + ", ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("- 값 변경 -");
		arr2[1][1] = 9;
		arr2[0][2] = 8;
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + ", ");
			}
			System.out.println();
		}
		
		System.out.println();
		for (int[] arr : arr2) {
			System.out.println(Arrays.toString(arr));
		}
	}
}
