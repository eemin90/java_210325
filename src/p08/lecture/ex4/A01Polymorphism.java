package p08.lecture.ex4;

public class A01Polymorphism {
	public static void main(String[] args) {
		System.out.println("영웅 생성");
		Hero hero = new Hero();
		
		System.out.println("무기 장착");
		hero.setGun(new NormalGun());
		
		System.out.println("공격");
		hero.attack();
		
		System.out.println("무기 장착");
		hero.setGun(new WaterGun());
		
		System.out.println("공격");
		hero.attack();
	}
}
