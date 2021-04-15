package p08.textbook.s080506;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
//		driver.drive(new Bus());
//		driver.drive(new Taxi());
		
		Vehicle v1 = new Bus();
		Vehicle v2 = new Taxi();
		driver.drive(v1);
		driver.drive(v2);
	}
}
