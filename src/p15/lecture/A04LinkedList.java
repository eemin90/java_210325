package p15.lecture;

import java.util.LinkedList;
import java.util.List;

public class A04LinkedList {
	public static void main(String[] args) {
		List<Integer> list1 = new LinkedList<>();
		list1.add(3);
		list1.add(5);
		list1.add(9);
		
		System.out.println(list1.size());
		System.out.println(list1.get(2));
	}
}
