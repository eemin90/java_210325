package p15.textbook.exercise.ex09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;

		// keySet(), iterator()
//		Set<String> keySet = map.keySet();
//		Iterator<String> iter = keySet.iterator();
//		while (iter.hasNext()) {
//			String key = iter.next();
//			int value = map.get(key);
//			
//			totalScore += value;
//			
//			if (maxScore < value) {
//				maxScore = value;
//				name = key;
//			}
//		}

		// keySet(), 향상된 for문
//		Set<String> keySet = map.keySet();
//		for (String str : keySet) {} // 이렇게 할 필요 없이 아래 코드로 바로 가능
		
//		for (String str : map.keySet()) {
//			String key = str;
//			int value = map.get(key);
//			
//			totalScore += value;
//			
//			if (maxScore < value) {
//				maxScore = value;
//				name = key;
//			}
//		}

		// entrySet(), iterator()
//		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//		Iterator<Map.Entry<String, Integer>> iter = entrySet.iterator();
//		while (iter.hasNext()) {
//			Map.Entry<String, Integer> entry = iter.next();
//			String key = entry.getKey();
//			int value = entry.getValue();
//			
//			totalScore += value;
//			
//			if (maxScore < value) {
//				maxScore = value;
//				name = key;
//			}
//		}
		
		// entrySet(), 향상된 for문
//		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//		for (Map.Entry<String, Integer> entry : entrySet) {} // 이렇게 할 필요 없이 아래 코드로 바로 가능
		
//		for (Map.Entry<String, Integer> entry : map.entrySet()) {
//			String key = entry.getKey();
//			int value = entry.getValue();
//			
//			totalScore += value;
//			
//			if (maxScore < value) {
//				maxScore = value;
//				name = key;
//			}
//		}

		System.out.println("평균점수: " + (totalScore / map.size()));
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
	}
}
