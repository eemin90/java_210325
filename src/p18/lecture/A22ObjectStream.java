package p18.lecture;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class A22ObjectStream {
	public static void main(String[] args) throws Exception {
		String path = "src/p18/lecture/output9.txt";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new String("java"));
		oos.writeObject(new String[] {"css", "html"});
		
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		String s = (String) ois.readObject();
		String[] arr = (String[]) ois.readObject();
		System.out.println(s);
		System.out.println(arr[0]);
		
		ois.close();
		fis.close();
	}
}
