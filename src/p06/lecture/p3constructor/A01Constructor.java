package p06.lecture.p3constructor;

public class A01Constructor {
	// 생성자(constructor)
	// 객체가 생성될 때 해야하는 일들이 작성되는 코드 블럭
	// 주로 필드를 초기화 하는데 사용됨
	
	// 생성자명은 클래스명과 같다
	// 다른 파라미터를 갖는 여러 생성자가 만들어 질 수 있음
	
	public static void main(String[] args) {
		/*
		Car car1 = new Car();
		car1.name = "tesla";
		car1.model = "model X";
		
		Car car2 = new Car();
		car2.name = "benz";
		car2.model = "s-class";
		*/
		
		Car car1 = new Car("tesla", "model X");
		System.out.println(car1.name);
		System.out.println(car1.model);
	}
}
