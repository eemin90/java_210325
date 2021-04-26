package p13.lecture;

public class A03Generic {
	public static void main(String[] args) {
		Generic3<String> g3 = new Generic3<>();
		g3.setO("java");
		String s = g3.getO();
		System.out.println(s);

		Generic3<Integer> g4 = new Generic3<>();
//		g4.setO("java");
		g4.setO(33);
		int i = g4.getO();
		System.out.println(i);

		Generic3<Double> g5 = new Generic3<>();
//		g5.setO(11);
		g5.setO(1.1);
		Double d = g5.getO();
		System.out.println(d);
	}
}

class Generic3<T> {
	private T o;

	public T getO() {
		return o;
	}

	public void setO(T o) {
		this.o = o;
	}
}
