package p05.lecture;

import java.util.Arrays;

public class A31MatrixSum {
	public static void main(String[] args) {
		int[][] mat1 = {
				{1, 2, 3},
				{5, 6, 7},
				{9, 8, 7},
				{2, 3, 4},
		};
		
		int[][] mat2 = {
				{22, 33, 44},
				{77, 88, 99},
				{3, 2, 1},
				{0, 1, 2},
		};
		
		int[][] mat3 = sum(mat1, mat2);
		
		for (int[] row : mat3) {
			System.out.println(Arrays.toString(row));
		}
	}

	public static int[][] sum(int[][] a, int[][] b) {
		int[][] c = new int[a.length][]; // 0, 1, 2, 3
		
		for (int i = 0; i < c.length; i++) {
			c[i] = new int[a[i].length]; // c[0] a[0].length --> 3 .... c[3] a[3].length --> 3
			for (int j = 0; j < c[i].length; j++) { // i0 j0 j1 j2, i1 j0 j1 j2, i2 j0 j1 j2, i3 j0 j1 j2
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return c;
	}
}
