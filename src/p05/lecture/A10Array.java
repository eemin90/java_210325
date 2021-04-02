package p05.lecture;

import java.util.Arrays;

public class A10Array {
	public static void main(String[] args) {
		// Array(배열) : 같은 타입의 여러개의 값을 갖는 자료형
		
		int i = 5;
		i = 5;
		
		int[] arr; // 배열도 참조타입
		arr = new int[3];
		
		arr[0] = 5;
		arr[1] = 7;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(Arrays.toString(arr));
		
		int[] q;
		
//		q = {1, 2, 5}; // 컴파일 에러
		q = new int[] {1, 2, 5}; // 이렇게 생성해야 함
		
//		int[] q = {1, 2 , 5}; // 또는 애초에 이렇게 해야함
	}
}
