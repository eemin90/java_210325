package p07.lecture.p2constructor;

public class Super {
	private int i;
	
	public Super() {
		
	}
	
	public Super(int i) {
		this.i = i;
	}
	
	public int getI() {
		return i;
	}
	
	public void setI(int i) {
		this.i = i;
	}
	
	void method1() {
		System.out.println("method1");
	}
}
