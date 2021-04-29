package p15.lecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A07Set {
	public static void main(String[] args) {
		// Set: 순서 없고, 중복 불가

		Set<Integer> set = new HashSet<>();

		set.add(9);
		set.add(8);
		set.add(2);

		System.out.println(set.size()); // 3

		set.add(9); // 이미 있는 값이라 추가되지 않음

		System.out.println(set.size()); // 3

		boolean c = set.contains(9); // 9가 저장되어 있는지
		System.out.println(c);

		set.remove(9); // 9라는 값을 제거
		System.out.println(set.size()); // 2

		set.add(9);
		set.add(3);
		set.add(2); // 이미 있는 값이라 추가되지 않음

		System.out.println(set.size());

		Iterator<Integer> iter = set.iterator(); // 저장된 객체를 한 번씩 가져오는 반복자 리턴

//		System.out.println(iter.hasNext()); // 가져올 객체가 있으면 true, 없으면 false
//		System.out.println(iter.next()); // next() 메소드로 하나의 객체를 가져온다
//		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		
//		System.out.println(iter.hasNext()); // false
//		System.out.println(iter.next()); // 저장된 갯수 이상으로 객체를 가져오려고 하면 Exception 발생

		while (iter.hasNext()) { // hasNext() 메소드는 while문과 잘 맞는다
			Integer n = iter.next();
			System.out.println(n);
		}
		System.out.println();
		System.out.println("set.size: " + set.size());
		
		System.out.println("삭제 후");
		while (iter.hasNext()) {
			Integer n = iter.next();
			if(n == 9) { // 9라는 객체가 있으면 삭제된다
				iter.remove();
			}
		}
		
		iter = set.iterator();
		while (iter.hasNext()) {
			Integer n = iter.next();
			System.out.println(n);
		}
	}
}
