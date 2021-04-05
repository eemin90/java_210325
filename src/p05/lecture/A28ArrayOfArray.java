package p05.lecture;

import java.util.Arrays;

public class A28ArrayOfArray {
	public static void main(String[] args) {
		int[][] arr = new int[2][]; // 2행 [0], [0]
		
		arr[0] = new int[] {9, 8, 7}; // 1행 [9, 8, 7]
		arr[1] = arr[0]; // 2행(1행과 주소값 같음) [9, 8, 7]
		
		for (int[] row : arr) {
			System.out.println(Arrays.toString(row)); // [9, 8, 7], [9, 8, 7]
		}
		
		// 변경
		arr[1][0] = 10; // 2행의 1열 값을 10으로
		arr[1][1] = 20; // 2행의 2열 값을 20으로
		arr[1][2] = 30; // 2행의 3열 값을 30으로
		
		for (int[] row : arr) {
			System.out.println(Arrays.toString(row)); // [10, 20, 30], [10, 20, 30]
		}											  // [9, 8, 7], [10, 20, 30]이 아니고 위 결과가 나온 이유는,
	}												  // 2행과 1행의 참조가 같아서 2행을 변경할 때 1행도 같이 변경 되었기 때문.
}
