package p15.lecture;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class A12MapValues {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("spring", 11);
		map.put("summer", 12);
		map.put("fall", 13);
		map.put("winter", 14);
		
//		Collection<Integer> values = map.values();
//		for (Integer value : values) {
//			System.out.println(value);
//		}
		
		for (Integer value : map.values()) {
			System.out.println(value);
		}
	}
}
