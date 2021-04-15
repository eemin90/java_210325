package p08.lecture.ex5;

public class A01TypeCasting {
	public static void main(String[] args) {
		Malamute d1 = new Malamute();
		d1.bark();
		d1.sit();
		d1.pull();
		
		Pet p1 = d1;
//		p1.bark(); // not ok
		p1.sit();
//		p1.pull(); // not ok
		
		SledDog s1 = d1;
//		s1.bark(); // not ok
//		s1.sit(); // not ok
		s1.pull();
		
		KindaDog k1 = d1;
		k1.bark();
//		k1.sit(); // not ok
//		k1.pull(); // not ok
		
		Malamute d2 = (Malamute) k1;
		d2.bark();
		d2.sit();
		d2.pull();
		
//		Wolf w1 = (Wolf) k1; // k1은 현재 Malamute의 주소값을 참조하고 있음
//		w1.bark();			 // 따라서 Wolf 타입으로 캐스팅 불가
		
		Wolf w1 = new Wolf();
		KindaDog k2 = w1;
		k2.bark();
		
		System.out.println("프로그램 종료");
	}
}
