package p13.lecture;

public class A08WildCard {
	public static void main(String[] args) {
		putBox(new Box8<Object>());
		putBox(new Box8<MyClass8>());
		
		getBox(new Box8<MyClass8>());
		getBox(new Box8<Child8>());
		
		allBox(new Box8<Object>());
		allBox(new Box8<MyClass8>());
		allBox(new Box8<Child8>());
	}
	
	public static void putBox(Box8<? super MyClass8> box) {
		box.setField(new MyClass8());
	}
	
	public static void getBox(Box8<? extends MyClass8> box) {
		MyClass8 o1 = box.getField();
	}
	
	public static void allBox(Box8<?> box) {
		Object o1 = box.getField();
//		box.setField(o1);
	}
}

class Box8<T> {
	private T field;
	
	public void setField(T field) {
		this.field = field;
	}
	
	public T getField() {
		return field;
	}
}

class MyClass8 {}
class Child8 extends MyClass8 {}
