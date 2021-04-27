package p15.lecture;

import java.util.ArrayList;
import java.util.List;

public class A02List {
	// List: 순서가 있고 중복 저장 가능
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		// add: 값 추가
		list.add("java");
		list.add("spring");
		list.add("python");
//		list.add(3);
		
		// size: 크기
		int len = list.size();
		System.out.println(len);
		System.out.println();
		
		// get: 꺼내기
		String e1 = list.get(0);
		String e2 = list.get(1);
		String e3 = list.get(2);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println();
		
		// for문을 이용한 값 탐색
		System.out.println("for 탐색");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		// 향상된 for문을 이용한 값 탐색
		System.out.println("향상된 for 탐색");
		for (String e : list) {
			System.out.println(e);
		}
		System.out.println();
		
		// remove: 삭제
		list.add("servlet"); // 3번 index
		list.remove(3);
		
		// 삭제 후 값 탐색
		System.out.println("삭제 후 탐색");
		for (String e : list) {
			System.out.println(e);
		}
		System.out.println();
		
		list.add("object");
		
		System.out.println("삭제 전 탐색");
		for (String e : list) {
			System.out.println(e);
		}
		System.out.println();
		
		list.remove("java");
		
		System.out.println("삭제 후 탐색");
		for (String e : list) {
			System.out.println(e);
		}
		System.out.println();
	}
}
