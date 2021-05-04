package p18.lecture;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class A24Serializable {
	public static void main(String[] args) throws Exception {
		String file = "src/p18/lecture/output11.txt";
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new Book());
		
		oos.close();
		fos.close();
	}
}
