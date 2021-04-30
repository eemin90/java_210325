package p15.textbook.s150504;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		
		// 저장할 때 나이순으로 정렬됨(Person 클래스에서 compareTo 메소드 재정의했기 때문)
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("감자바", 25));
		treeSet.add(new Person("박지원", 31));
		
		Iterator<Person> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ":" + person.age);
		}
		
//		// 위 코드와 같음
//		for (Person p : treeSet) {
//			System.out.println(p.name + ":" + p.age);
//		}
	}
}
