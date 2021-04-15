package p08.lecture.ex5;

public class A02InstanceOf {
	public static void main(String[] args) {
		KindaDog k1 = new Malamute();
		
		System.out.println(k1 instanceof KindaDog);
		System.out.println(k1 instanceof Malamute);
		System.out.println(k1 instanceof Pet);
		System.out.println(k1 instanceof SledDog);
		System.out.println(k1 instanceof Wolf); // false
		
		Malamute m1 = (Malamute) k1;
		Pet p1 = (Pet) k1;
		SledDog s1 = (SledDog) k1;
		
		if(k1 instanceof Wolf) {
			Wolf w1 = (Wolf) k1;			
		} else {
			System.out.println("강제 타입 변환 불가!");
		}
		
		System.out.println("프로그램 종료");
	}
}
