package p09.textbook.ex4;

public class NestedClassExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		Car.Tire Tire = myCar.new Tire();
		
		Car.Engine engine = new Car.Engine();
	}
}
