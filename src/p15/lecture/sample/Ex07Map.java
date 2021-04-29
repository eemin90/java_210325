package p15.lecture.sample;

import java.util.HashMap;
import java.util.Map;

public class Ex07Map {
	public static void main(String[] args) {
		int[] arr1 = { 1, 1, 1, 3, 3, 2, 3, 2, 1, 4, 5, 5 };

		Map<Integer, Integer> map = count(arr1);

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		// 1이 몇개고 2가 몇개고... 리턴
	}

	private static Map<Integer, Integer> count(int[] arr1) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int n : arr1) { // arr1 배열의 값을 하나씩 받아서
			if (map.containsKey(n)) { // 받은 값이 키에 존재하면 
				map.put(n, map.get(n) + 1); // 해당 키의 value에 1을 더해줌(count가 추가로 1 올라감)
			} else {
				map.put(n, 1); // 처음 넣는 키일때 해당 키의 value를 1로(count 1)
			}
		}
		// 예를 들어 arr1 배열의 0번 index값인 1이 들어오면 처음 들어온것이기 때문에 1이라는 키가 생기고 value가 1이 됨
		// 그리고 arr1 배열의 1번 index값인 1이 또 들어오면 1이라는 키가 존재하기 때문에 1이라는 키의 value에 1이 더해져서 2가 되는 식으로..
		// 최종적으론 arr1 배열에 1이 몇개인지 2가 몇개인지 이렇게 리턴됨
		
		return map;
	}
}
