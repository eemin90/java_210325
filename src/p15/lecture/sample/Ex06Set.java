package p15.lecture.sample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex06Set {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5, 2, 3};
		int[] arr2 = {1, 2, 3, 4};
		
		int sum1 = sum(arr1);
		int sum2 = sum(arr2);
		
		System.out.println(sum1);
		System.out.println(sum2);
	}
	
	public static int sum(int[] nums) { // 받은 매개 변수의 배열 값을 전부 더할건데, 매개 값에서 중복 값은 한 번만 더하기
		int sum = 0;
		
		Set<Integer> arr = new HashSet<>();
		
//		for (int i = 0; i < nums.length; i++) {
//			arr.add(nums[i]); // Set에 추가할 때 자동으로 중복 값은 추가되지 않음
//		}
		
		for (int n : nums) { // 향상된 for문
			arr.add(n);
		}
		
//		Iterator<Integer> iter = arr.iterator(); // 반복자 얻기
//		
//		while (iter.hasNext()) { // 객체 수만큼 루핑
//			int num = iter.next(); // 한 개의 객체를 가져옴
//			sum += num; // 한 개씩 sum 변수에 더함
//		}
		
		for (int n : arr) { // 향상된 for문을 이용하면 반복자를 얻어서 쓸 필요가 없음
			sum += n;
		}
		
		return sum;
	}
}
