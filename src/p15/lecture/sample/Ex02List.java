package p15.lecture.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02List {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(5, 2, 6, 9, 0);
		List<Integer> list2 = Arrays.asList(3, 5, 8, 2, 7);

		List<Integer> merge1 = merge1(list1, list2);
		System.out.println(merge1);

		List<Integer> merge2 = merge2(list1, list2);
		System.out.println(merge2);
	}

	public static List<Integer> merge1(List<Integer> list1, List<Integer> list2) {
		List<Integer> merge = new ArrayList<>();

		for (int i = 0; i < list1.size(); i++) {
			merge.add(list1.get(i));
			merge.add(list2.get(i));
		}

		return merge;
	}

	public static List<Integer> merge2(List<Integer> list1, List<Integer> list2) {
		List<Integer> merge = new ArrayList<>();

		for (int i = 0; i < list1.size(); i++) {
			if (!merge.contains(list1.get(i))) { // merge의 index값 중 list1의 i번째 index 값과 같은 값이 없는경우
				merge.add(list1.get(i));		 // merge에 list1의 i번째 index 값 추가
			}

			if (!merge.contains(list2.get(i))) { // merge의 index값 중 list2의 i번째 index 값과 같은 값이 없는경우
				merge.add(list2.get(i));		 // merge에 list2의 i번째 index 값 추가
			}
		}

		return merge;
	}
}
