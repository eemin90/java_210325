package p08.lecture.ex4;

public class Hero {
	private Gun gun;
	
	public void setGun(Gun gun) {
		this.gun = gun;
	}
	
	public void attack() {
		this.gun.fire();
	}
}
