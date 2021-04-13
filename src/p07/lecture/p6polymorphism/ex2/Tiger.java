package p07.lecture.p6polymorphism.ex2;

public class Tiger extends KindaCat {
	@Override
	public void cry() {
		System.out.println("어흥!!");
	}
	
	public void hunt() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}
