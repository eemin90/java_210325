package p15.lecture;

import java.util.HashSet;
import java.util.Set;

public class A08SetEquals {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();
		
		Person p1 = new Person();
		p1.setName("trump");
		
		Person p2 = new Person();
		p2.setName("donald");
		
		Person p3 = new Person();
		p3.setName("trump");
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		
		System.out.println(set.size());
	}
}

class Person {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
