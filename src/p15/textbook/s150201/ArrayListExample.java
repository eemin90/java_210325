package p15.textbook.s150201;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		// String 객체를 저장
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database"); // 2번 index에 "Database"를 넣음(기존의 2번 index 이후 값은 순번이 1씩 밀려남)
		list.add("iBATIS");
		
		// 저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		// 2번 인덱스의 객체 얻기
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		// 저장된 총 객체 수만큼 루핑
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();
		
		list.remove(2); // "Database" 삭제됨
		list.remove(2); // "Servlet/JSP" 삭제됨
		list.remove("iBATIS"); // index 중 "iBATIS" 라는 엘리먼트 삭제됨(0에서 가까운 엘리먼트 1개만 삭제)
		                       // 예를 들어 2번 index와 6번 index에 "iBATIS"라는 값이 있으면 2번 index만 삭제됨
		
		// 저장된 총 객체 수만큼 루핑
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
	}
}
