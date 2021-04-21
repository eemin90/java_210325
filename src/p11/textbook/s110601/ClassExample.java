package p11.textbook.s110601;

import p06.textbook.s060602.Car;

public class ClassExample {
	public static void main(String[] args) {
		// 클래스 객체를 얻는데는 3가지 방법이 있다
		
		// .getClass() 메소드 이용
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		// .forName() 메소드 이용
		try {
			Class clazz2 = Class.forName("p06.textbook.s060602.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
			System.out.println();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// .class 키워드 이용
		Class clazz3 = p06.textbook.s060602.Car.class;
		System.out.println(clazz3.getName());
		System.out.println(clazz3.getSimpleName());
		System.out.println(clazz3.getPackage().getName());
	}
}
