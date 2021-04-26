package p13.lecture;

public class A04Generic {
	public static void main(String[] args) {
		Generic4<String, Integer, Double> g4 = new Generic4<>();
		g4.setField1("java");
		g4.setField2(99);
		g4.setField3(3.14);
		
		String s = g4.getField1();
		int i = g4.getField2();
		double d = g4.getField3();
		
		System.out.println(s);
		System.out.println(i);
		System.out.println(d);
	}
}

class Generic4<T, S, U> {
	private T field1;
	private S field2;
	private U field3;

	public T getField1() {
		return field1;
	}

	public void setField1(T field1) {
		this.field1 = field1;
	}

	public S getField2() {
		return field2;
	}

	public void setField2(S field2) {
		this.field2 = field2;
	}

	public U getField3() {
		return field3;
	}

	public void setField3(U field3) {
		this.field3 = field3;
	}
}
