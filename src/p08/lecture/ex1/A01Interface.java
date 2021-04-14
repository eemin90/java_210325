package p08.lecture.ex1;

public class A01Interface {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		Malamute d1 = new Malamute();
		
		KindaCat k1 = c1;
		Pet p1 = c1;
		p1.sit();
		
		KindaDog k2 = d1;
		Pet p2 = d1;
		p2.sit();
		
//		Pet p3 = new Pet(); // 인터페이스는 객체로 생성 불가
	}
}
