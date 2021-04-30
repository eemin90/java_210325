package p15.lecture;

import java.util.Iterator;
import java.util.TreeSet;

public class A15TreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(100);
		set.add(50);
		set.add(200);
		set.add(30);
		set.add(300);
		
		for (int n : set) {
			System.out.println(n);
		}
		
		System.out.println(set.first()); // 제일 낮은 객체를 리턴(30)
		System.out.println(set.last()); // 제일 높은 객체를 리턴 (300)
		
		System.out.println(set.lower(210)); // 주어진 객체의 바로 아래 객체 리턴(200)
		System.out.println(set.higher(210)); // 주어진 객체의 바로 위 객체 리턴(300)
		
		System.out.println("내림차순 탐색");
		Iterator<Integer> di = set.descendingIterator();
		while (di.hasNext()) {
			System.out.println(di.next());
		}
	}
}
