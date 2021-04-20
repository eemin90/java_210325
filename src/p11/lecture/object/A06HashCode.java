package p11.lecture.object;

public class A06HashCode {
	public static void main(String[] args) {
		Desk d1 = new Desk("tree", 3);
		Desk d2 = new Desk("blue", 4);
		Desk d3 = new Desk("blue", 4);
		
		System.out.println("참조값");
		System.out.println(System.identityHashCode(d1));
		System.out.println(System.identityHashCode(d2));
		System.out.println(System.identityHashCode(d3));
		
		System.out.println("hash code");
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());
	}
}

class Desk {
	private String name;
	private int num;

	public Desk(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + num;
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
		Desk other = (Desk) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num != other.num)
			return false;
		return true;
	}
}