package p15.lecture.sample;

import java.util.Arrays;
import java.util.List;

public class Ex01List {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(7, 9, -100, 30, 90, 700);

		System.out.println(list);

		int sum = sum(list);
		System.out.println(sum);

		int max = max(list);
		System.out.println(max);
		
		int indexOfMax = indexOfMax(list);
		System.out.println(indexOfMax);
		System.out.println(list.get(indexOfMax));
	}

	public static int sum(List<Integer> list) {
		int res = 0;

//		for (int i = 0; i < list.size(); i++) {
//			res += list.get(i);
//		}

		for (int i : list) {
			res += i;
		}

		return res;
	}

	public static int max(List<Integer> list) {
//		int max = list.get(0);
		
		int max = Integer.MIN_VALUE;

//		for (int i = 0; i < list.size(); i++) {
//			if (max < list.get(i)) {
//				max = list.get(i);
//			}
//		}
		
		for (int i : list) {
			if (max < i) {
				max = i;
			}
		}

		return max;
	}
	
	public static int indexOfMax(List<Integer> list) {
//		int max = Integer.MIN_VALUE;
//		
//		for (int i : list) {
//			if (max < i) {
//				max = i;
//			}
//		}
//		
//		return list.indexOf(max);
		
		int idx = 0;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
				idx = i;
			}
		}
		
		return idx;
	}
}
