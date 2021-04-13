package p07.lecture.p6polymorphism.ex2;

public class A03TypeConversion {
	public static void main(String[] args) {
		Gun gun1 = new Gun();
		WaterGun gun2 = new WaterGun();
		RainbowGun gun3 = new RainbowGun();
		
		Gun gun4 = gun2;
		Gun gun5 = gun3;
		
		process(gun1);
		process(gun2);
		process(gun3);
		
		process(new RainbowGun());
	}
	
	public static void process(Gun gun) {
		gun.fire();
	}
}
