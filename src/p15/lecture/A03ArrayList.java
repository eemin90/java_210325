package p15.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A03ArrayList {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		arr1[0] = 99;
		arr1[1] = 100;
		arr1[2] = 101;
		
//		arr1[3] = 102; // Exception 발생
		arr1 = Arrays.copyOf(arr1, 4); // 배열의 길이를 4로 늘림
		arr1[3] = 102;
		System.out.println("arr1: " + Arrays.toString(arr1));
		
		List<Integer> list = new ArrayList<>();
		list.add(99);
		list.add(100);
		list.add(101);
		list.add(102); // 자동으로 길이가 늘어남
		
		System.out.println("list: " + list);
	}
}
