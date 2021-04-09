package p06.lecture.p9encapsulation;

public class A01Encapsulation {
	// 캡슐화(encapsulation)
	// 필드를 private
	// 메소드를 public
	
	// 관련 속성과 기능을 하나의 클래스로 묶는 것
	
	public static void main(String[] args) {
		Computer com1 = new Computer();
//		com1.ram = 4;
		
		com1.setRam(4);
		com1.setRam(8);
		
		com1.setRam(0);
		
//		System.out.println(com1.ram);
		System.out.println(com1.getRam());
	}
	
}
