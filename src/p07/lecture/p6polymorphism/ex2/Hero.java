package p07.lecture.p6polymorphism.ex2;

public class Hero {
	private Gun gun;
	
	public Gun getGun() {
		return gun;
	}
	
	public void setGun(Gun gun) {
		this.gun = gun;
	}
	
	public void attack() {
		System.out.println("공격!");
		gun.fire();
	}
}
