package p15.lecture;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A09Map {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(2, 99);
		map.put(3, 6);
		map.put(8, 77);
		
		System.out.println(map.size()); // 3
		
		map.put(8, 78); // 위에 8이라는 키가 존재하기 때문에 값만 덮어씀
		
		System.out.println(map.size()); // 3
		
		System.out.println(map.get(2)); // 2라는 키의 value값인 99가 출력됨
		
		Set<Integer> keys = map.keySet(); // 모든 키를 Set 객체에 담아서 리턴
		
		for (Integer key : keys) {
			System.out.println(key + ": " + map.get(key));
		}
		
		map.remove(8); // 8이라는 키와 value값을 제거
		System.out.println(map.size());
		
		Set<Map.Entry<Integer, Integer>> entries = map.entrySet(); // 키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 Set에 담아서 리턴
		
		for (Map.Entry<Integer, Integer> entry : entries) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
