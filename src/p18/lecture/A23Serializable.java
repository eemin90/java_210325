package p18.lecture;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class A23Serializable {
	public static void main(String[] args) throws Exception {
		String path = "src/p18/lecture/output10.txt";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(new Car()); // serialization(직렬화)

		oos.close();
		
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Car c = (Car) ois.readObject();
		System.out.println(c);
		
		ois.close();
	}
}

class Car implements Serializable {
	private String name;
	private int id;
}
