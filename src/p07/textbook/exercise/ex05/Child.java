package p07.textbook.exercise.ex05;

public class Child extends Parent{
	private int studentNo;
	
	public Child(String name, int studentNo) {
//		this.name = name;
		super(name); // 상위 클래스 생성자 호출
		this.studentNo = studentNo;
	}
}
