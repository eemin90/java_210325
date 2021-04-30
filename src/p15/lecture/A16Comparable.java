package p15.lecture;

import java.util.TreeSet;

public class A16Comparable {
	public static void main(String[] args) {
		TreeSet<Car> set = new TreeSet<>();
		set.add(new Car(100));
		set.add(new Car(200));
		set.add(new Car(50));
		set.add(new Car(150));

		System.out.println(set);
	}
}

class Car implements Comparable<Car> {
	private int model;

	public Car(int model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + "]";
	}

	@Override
	public int compareTo(Car param) {
		// this가 param보다 크면 양수
		// this가 param보다 작으면 음수
		// this가 param과 같으면 0

		return this.model - param.model;
	}
}
